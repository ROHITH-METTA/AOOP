document.addEventListener('DOMContentLoaded', () => {
    console.log('Flashcards script loaded');
    const debugInfo = document.getElementById('debug-info');
    const flashcardsContainer = document.getElementById('flashcards-container');
    const urlParams = new URLSearchParams(window.location.search);
    const fileName = urlParams.get('file');

    debugInfo.textContent += ' Script running.';
    console.log('File name from URL:', fileName);

    if (!fileName) {
        debugInfo.textContent += ' No file specified.';
        flashcardsContainer.innerHTML = '<p>No file specified. Please upload a file first.</p>';
        return;
    }

    debugInfo.textContent += ' Fetching flashcards...';
    fetch(`/get_flashcards?file=${encodeURIComponent(fileName)}`)
        .then(response => {
            console.log('Response status:', response.status);
            debugInfo.textContent += ` Response status: ${response.status}`;
            return response.json();
        })
        .then(data => {
            console.log('Received data:', data);
            debugInfo.textContent += ' Data received.';
            if (data.error) {
                flashcardsContainer.innerHTML = `<p>Error: ${data.error}</p>`;
                return;
            }
            const questions = data.questions;
            if (questions && questions.length > 0) {
                debugInfo.textContent += ` Creating ${questions.length} flashcards.`;
                questions.forEach((q, index) => {
                    const flashcard = createFlashcard(q, index);
                    flashcardsContainer.appendChild(flashcard);
                });
            } else {
                flashcardsContainer.innerHTML = '<p>No flashcards generated. The PDF might be empty or unreadable.</p>';
            }
        })
        .catch(error => {
            console.error('Error fetching flashcards:', error);
            debugInfo.textContent += ` Error: ${error.message}`;
            flashcardsContainer.innerHTML = '<p>Error loading flashcards. Please try again.</p>';
        });

    function createFlashcard(questionData, index) {
        console.log('Creating flashcard:', questionData);
        const flashcard = document.createElement('div');
        flashcard.classList.add('flashcard');
        flashcard.innerHTML = `
            <div class="flashcard-front">
                <p>${questionData.question}</p>
                ${questionData.options.map(option => `<button>${option}</button>`).join('')}
            </div>
            <div class="flashcard-back">
                <p>Correct answer: ${questionData.answer}</p>
            </div>
        `;
        return flashcard;
    }
});
