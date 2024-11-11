from flask import Flask, request, jsonify, render_template
import os
from werkzeug.utils import secure_filename
import PyPDF2
import logging
import spacy
import random
import re
from nltk.corpus import wordnet
import nltk

nltk.download('wordnet')
nlp = spacy.load("en_core_web_sm")

app = Flask(__name__)
logging.basicConfig(level=logging.DEBUG)

UPLOAD_FOLDER = 'uploads/'
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER

def generate_questions_from_text(text):
    # Split the text into paragraphs
    paragraphs = text.split('\n\n')
    questions = []
    used_questions = set()

    for paragraph in paragraphs:
        # Extract the question and answer from the paragraph
        match = re.match(r'^(.*?)\n(.*)', paragraph, re.DOTALL)
        if match:
            question = match.group(1).strip()
            answer = match.group(2).strip()

            # Check if we already have a similar question
            if any(similar_question(question, q['question']) for q in questions):
                continue

            # Generate wrong answers
            wrong_answers = generate_wrong_answers(answer, paragraphs)

            # Create the question object
            question_obj = {
                'question': question,
                'options': [answer] + wrong_answers,
                'answer': answer
            }

            # Shuffle the options
            random.shuffle(question_obj['options'])

            questions.append(question_obj)
            used_questions.add(question)

        # Stop if we have 5 questions
        if len(questions) == 5:
            break

    return questions

def similar_question(q1, q2):
    # Simple similarity check based on the first few words
    return q1.split()[:3] == q2.split()[:3]

def generate_wrong_answers(correct_answer, paragraphs):
    wrong_answers = []
    for _ in range(3):
        # Pick a random paragraph and extract a sentence
        random_paragraph = random.choice(paragraphs)
        sentences = re.split(r'(?<=[.!?])\s+', random_paragraph)
        if sentences:
            wrong_answer = random.choice(sentences).strip()
            # Ensure the wrong answer is different from the correct one and other wrong answers
            if wrong_answer != correct_answer and wrong_answer not in wrong_answers:
                wrong_answers.append(wrong_answer)
    
    # If we couldn't generate 3 unique wrong answers, fill with dummy answers
    while len(wrong_answers) < 3:
        dummy = f"This is a dummy answer {len(wrong_answers) + 1}"
        wrong_answers.append(dummy)
    
    return wrong_answers

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/upload', methods=['POST'])
def upload_file():
    if 'file' not in request.files:
        return jsonify({'error': 'No file part'}), 400

    file = request.files['file']

    if file and allowed_file(file.filename):
        filename = secure_filename(file.filename)
        file_path = os.path.join(app.config['UPLOAD_FOLDER'], filename)
        file.save(file_path)
        return jsonify({'success': True, 'filename': filename}), 200
    else:
        return jsonify({'error': 'Invalid file type'}), 400

@app.route('/flashcards')
def flashcards():
    return render_template('flashcards.html')

@app.route('/get_flashcards', methods=['GET'])
def get_flashcards():
    filename = request.args.get('file')
    app.logger.info(f"Received request for flashcards with filename: {filename}")
    
    if not filename:
        app.logger.error("No file specified")
        return jsonify({'error': 'No file specified'}), 400

    file_path = os.path.join(app.config['UPLOAD_FOLDER'], filename)
    app.logger.info(f"Looking for file at path: {file_path}")

    if not os.path.exists(file_path):
        app.logger.error(f"File not found: {file_path}")
        return jsonify({'error': 'File not found'}), 404

    # Extract text from the PDF
    try:
        with open(file_path, 'rb') as f:
            reader = PyPDF2.PdfReader(f)
            text = ''
            for page in reader.pages:
                text += page.extract_text()
        app.logger.info(f"Extracted text from PDF: {text[:100]}...")  # Log first 100 characters
    except Exception as e:
        app.logger.error(f"Error extracting text from PDF: {str(e)}")
        return jsonify({'error': 'Error processing PDF'}), 500

    # Generate questions
    try:
        questions = generate_questions_from_text(text)
        app.logger.info(f"Generated {len(questions)} questions")
        app.logger.info(f"Sample question: {questions[0] if questions else 'No questions generated'}")
    except Exception as e:
        app.logger.error(f"Error generating questions: {str(e)}")
        return jsonify({'error': 'Error generating questions'}), 500

    return jsonify({'questions': questions}), 200

# Download necessary NLTK data
nltk.download('punkt')
nltk.download('averaged_perceptron_tagger')
nltk.download('stopwords')

def allowed_file(filename):
    return '.' in filename and filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS

if __name__ == '__main__':
    os.makedirs(UPLOAD_FOLDER, exist_ok=True)
    app.run(debug=True)
