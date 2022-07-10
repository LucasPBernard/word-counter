package Program;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static Program.WordCounter.wordCounter;

public class Main {
    public static void main(String[] args) throws IOException {
        String someWords = "here are some other words. and even more words.";
        Path filePath = Path.of("../word-counter/someWords.txt");
        String someWordsFile = Files.readString(filePath);
        String someWordsResult = "There are " + wordCounter(someWords) + " words in the string someWords";
        String someWordsFileResult = "There are " + wordCounter(someWordsFile) + " words in the file someWords.txt";
        System.out.println(someWordsResult);
        System.out.println(someWordsFileResult);
    }
}