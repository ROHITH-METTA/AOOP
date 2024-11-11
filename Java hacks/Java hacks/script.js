document.addEventListener('DOMContentLoaded', () => {
    // Initialize Lucide icons
    lucide.createIcons();

    const dropZone = document.getElementById('dropZone');
    const fileInput = document.getElementById('fileInput');

    dropZone.addEventListener('click', () => fileInput.click());

    dropZone.addEventListener('dragover', (e) => {
        e.preventDefault();
        dropZone.classList.add('drag-over');
    });

    dropZone.addEventListener('dragleave', () => {
        dropZone.classList.remove('drag-over');
    });

    dropZone.addEventListener('drop', (e) => {
        e.preventDefault();
        dropZone.classList.remove('drag-over');
        handleFiles(e.dataTransfer.files);
    });

    fileInput.addEventListener('change', () => {
        handleFiles(fileInput.files);
    });

    function handleFiles(files) {
        if (files.length > 0) {
            const file = files[0];
            if (file.type === 'application/pdf') {
                extractTextFromPDF(file);
            } else {
                alert('Please upload a PDF file.');
            }
        }
    }

    async function extractTextFromPDF(file) {
        const fileReader = new FileReader();
        fileReader.onload = async function () {
            const typedArray = new Uint8Array(this.result);
            const pdf = await pdfjsLib.getDocument(typedArray).promise;
            let text = '';

            for (let pageNum = 1; pageNum <= pdf.numPages; pageNum++) {
                const page = await pdf.getPage(pageNum);
                const content = await page.getTextContent();
                const pageText = content.items.map(item => item.str).join(' ');
                text += pageText + '\n';
            }

            processTextForFlashcards(text);
        };
        fileReader.readAsArrayBuffer(file);
    }

    function processTextForFlashcards(content) {
        // Placeholder for NLP processing
        // Extract key concepts and generate questions
        const lines = content.split('.');  // Split sentences for processing
        const flashcardContainer = document.createElement('div');
        flashcardContainer.className = 'flashcard-container';
        document.body.appendChild(flashcardContainer);

        let questionsGenerated = 0;

        lines.forEach((line) => {
            if (questionsGenerated < 10) {
                const { question, answer } = generateQuestion(line.trim());
                if (question && answer) {
                    const card = createFlashcard(question, answer);
                    flashcardContainer.appendChild(card);
                    questionsGenerated++;
                }
            }
        });
    }

    function generateQuestion(text) {
        // Basic NLP-based question creation (this can be replaced with real NLP processing)
        const keywords = extractKeywords(text);
        if (keywords.length > 0) {
            const question = `What is ${keywords[0]}?`;  // Basic question template
            return { question, answer: text };
        }
        return { question: null, answer: null };
    }

    function extractKeywords(text) {
        // Very basic keyword extraction, this can be enhanced with NLP
        const words = text.split(' ');
        const importantWords = words.filter(word => word.length > 3 && !stopwords.includes(word.toLowerCase()));
        return importantWords.slice(0, 1); // Take the first important word
    }

    const stopwords = ['the', 'is', 'in', 'and', 'or', 'a', 'of', 'for', 'to', 'with'];

    function createFlashcard(question, answer) {
        const card = document.createElement('div');
        card.className = 'flashcard';
        card.innerHTML = `
            <div class="flashcard-question">${question}</div>
            <div class="flashcard-answer" style="display: none;">${answer}</div>
        `;
        card.addEventListener('click', () => {
            const answerDiv = card.querySelector('.flashcard-answer');
            answerDiv.style.display = answerDiv.style.display === 'none' ? 'block' : 'none';
        });
        return card;
    }
});
``