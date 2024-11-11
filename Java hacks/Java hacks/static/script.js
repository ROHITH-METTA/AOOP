document.addEventListener('DOMContentLoaded', () => {
    const dropZone = document.getElementById('dropZone');
    const fileInput = document.getElementById('fileInput');
    const fileNameDisplay = document.getElementById('fileName');
    const flashcardsButton = document.getElementById('flashcardsButton');
    let uploadedFile = null;

    console.log('Initial localStorage state:', JSON.stringify(localStorage));

    // Check if a file was previously uploaded
    const previousFileName = localStorage.getItem('uploadedFileName');
    if (previousFileName) {
        fileNameDisplay.textContent = `Uploaded File: ${previousFileName}`;
        console.log('Previous file found:', previousFileName);
    }

    // Drag-and-drop functionality
    dropZone.addEventListener('click', () => fileInput.click());
    dropZone.addEventListener('dragover', (e) => {
        e.preventDefault();
        dropZone.classList.add('drag-over');
    });
    dropZone.addEventListener('dragleave', () => dropZone.classList.remove('drag-over'));
    dropZone.addEventListener('drop', (e) => {
        e.preventDefault();
        dropZone.classList.remove('drag-over');
        handleFiles(e.dataTransfer.files);
    });

    fileInput.addEventListener('change', () => handleFiles(fileInput.files));

    function handleFiles(files) {
        if (files.length > 0 && files[0].type === 'application/pdf') {
            uploadedFile = files[0];
            fileNameDisplay.textContent = `Uploaded File: ${uploadedFile.name}`;
            uploadFile(uploadedFile);
        } else {
            alert('Please upload a valid PDF.');
        }
    }

    function uploadFile(file) {
        const formData = new FormData();
        formData.append('file', file);

        fetch('/upload', {
            method: 'POST',
            body: formData,
        })
        .then(response => response.json())
        .then(data => {
            if (data.success) {
                console.log('File uploaded successfully');
                alert('File uploaded successfully.');
                localStorage.setItem('uploadedFileName', data.filename);
                localStorage.setItem('fileUploaded', 'true');
                console.log('localStorage after upload:', JSON.stringify(localStorage));
            } else {
                console.log('File upload failed');
                alert('File upload failed.');
                localStorage.removeItem('uploadedFileName');
                localStorage.setItem('fileUploaded', 'false');
            }
        })
        .catch(error => {
            console.error('Error uploading file:', error);
            localStorage.removeItem('uploadedFileName');
            localStorage.setItem('fileUploaded', 'false');
        });
    }

    window.goToFlashcards = () => {
        const fileUploaded = localStorage.getItem('fileUploaded') === 'true';
        const uploadedFileName = localStorage.getItem('uploadedFileName');
        
        console.log('goToFlashcards called');
        console.log('fileUploaded:', fileUploaded);
        console.log('uploadedFileName:', uploadedFileName);
        console.log('localStorage in goToFlashcards:', JSON.stringify(localStorage));

        if (fileUploaded && uploadedFileName) {
            console.log('Navigating to flashcards page');
            window.location.href = `/flashcards?file=${encodeURIComponent(uploadedFileName)}`;
        } else {
            console.log('No file uploaded');
            alert('Please upload a file first.');
        }
    };

    flashcardsButton.addEventListener('click', window.goToFlashcards);
});
