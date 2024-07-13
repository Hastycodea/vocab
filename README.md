# Vocabulary Practice Application README

## Overview
The Vocabulary Practice Application is a JavaFX-based application that allows users to add word pairs (words and their translations) to a dictionary and practice translating words. The application includes the following components:

1. **Dictionary**: Manages the storage of words and their translations.
2. **InputView**: Provides a user interface for adding new word pairs.
3. **PracticeView**: Provides a user interface for practicing translations.
4. **Statistics**: Tracks the number of guesses and correct guesses (commented out in the current implementation).
5. **StatisticsView**: Intended to display statistical data about the user's practice sessions (commented out in the current implementation).
6. **VocabularyPracticeApplication**: The main class that sets up and runs the JavaFX application.

## Directory Structure

```
src/main/java/application/
├── Dictionary.java
├── InputView.java
├── PracticeView.java
├── Statistics.java
├── StatisticsView.java
└── VocabularyPracticeApplication.java
```

## Classes

### Dictionary.java

Manages the storage and retrieval of words and their translations.

#### Methods:
- **Dictionary()**: Constructor that initializes the words and translations.
- **String get(String sana)**: Retrieves the translation for the given word.
- **void add(String word, String translation)**: Adds a word and its translation to the dictionary.
- **String getRandomWord()**: Returns a random word from the dictionary.
- **int wordCount()**: Returns the number of words in the dictionary.

### InputView.java

Provides a user interface for adding new word pairs to the dictionary.

#### Methods:
- **InputView(Dictionary dictionary)**: Constructor that initializes the InputView with the given dictionary.
- **Parent getView()**: Creates and returns the user interface for adding word pairs.

### PracticeView.java

Provides a user interface for practicing translations.

#### Methods:
- **PracticeView(Dictionary dictionary)**: Constructor that initializes the PracticeView with the given dictionary.
- **Parent getView()**: Creates and returns the user interface for practicing translations.

### Statistics.java

Tracks the number of guesses and correct guesses (commented out in the current implementation).

#### Methods:
- **Statistics(Dictionary dictionary)**: Constructor that initializes the Statistics with the given dictionary.
- **int getGuesses()**: Returns the total number of guesses.
- **int getCorrectGuesses()**: Returns the number of correct guesses.
- **void incrementGuesses()**: Increments the number of guesses.
- **void incrementCorrectGuesses()**: Increments the number of correct guesses.
- **int getWordCount()**: Returns the number of words in the dictionary.

### StatisticsView.java

Intended to display statistical data about the user's practice sessions (commented out in the current implementation).

### VocabularyPracticeApplication.java

The main class that sets up and runs the JavaFX application.

#### Methods:
- **void start(Stage stage)**: Sets up the main application window, including the dictionary, views, and menu.
- **static void main(String[] args)**: Launches the JavaFX application.

## How to Run

1. **Ensure Java and JavaFX are installed** on your system.
2. **Compile the project** using your preferred IDE or command line tool.
3. **Run the VocabularyPracticeApplication** class to start the application.

```sh
javac src/main/java/application/*.java
java -cp .:path/to/javafx-sdk/lib/* application.VocabularyPracticeApplication
```

## Usage

1. **Adding New Words**:
    - Click on "Enter new words" to switch to the input view.
    - Enter a word and its translation in the provided text fields.
    - Click "Add the word pair" to add the word and its translation to the dictionary.

2. **Practicing Translations**:
    - Click on "Practice" to switch to the practice view.
    - A word will be displayed for translation.
    - Enter the translation and click "Check".
    - Feedback will be provided indicating whether the translation is correct or incorrect.
    - A new word will be displayed for the next translation attempt.

## Future Enhancements

- **Implement and enable the Statistics class and StatisticsView** to provide users with feedback on their performance.
- **Add more functionality and improve the user interface** for better user experience.

## Notes

The application also contains commented-out sections with Finnish translations of the classes, which can be used for localization purposes.

---

This README provides a detailed overview of the Vocabulary Practice Application, including its structure, functionality, and usage instructions.
