document.addEventListener('DOMContentLoaded', () => {
    const flashcardsContainer = document.getElementById('flashcards-container');
    const urlParams = new URLSearchParams(window.location.search);
    const fileName = urlParams.get('file');

    // Fetch flashcard questions based on uploaded PDF
    fetch(`/flashcards?file=${encodeURIComponent(fileName)}`)
        .then(response => response.json())
        .then(data => {
            const questions = data.questions;
            questions.forEach((q, index) => {
                const flashcard = createFlashcard(q, index);
                flashcardsContainer.appendChild(flashcard);
            });
        });

    function createFlashcard(questionData, index) {
        const flashcard = document.createElement('div');
        flashcard.classList.add('flashcard');

        const front = document.createElement('div');
        front.classList.add('flashcard-front');
        const back = document.createElement('div');
        back.classList.add('flashcard-back');

        const question = document.createElement('p');
        question.textContent = questionData.question;
        front.appendChild(question);

        questionData.options.forEach(option => {
            const button = document.createElement('button');
            button.textContent = option;
            button.addEventListener('click', () => {
                if (option === questionData.answer) {
                    front.style.backgroundColor = 'green';
                } else {
                    flashcard.classList.add('flipped');
                }
            });
            front.appendChild(button);
        });

        const answer = document.createElement('p');
        answer.textContent = `Correct answer: ${questionData.answer}`;
        back.appendChild(answer);

        flashcard.appendChild(front);
        flashcard.appendChild(back);

        return flashcard;
    }
});
