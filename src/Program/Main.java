package Program;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static Program.WordCounter.wordCounter;

public class Main {
    public static void main(String[] args) throws IOException {
        String someWords = "here are some other words. and even more words.";
        Path filePath = Path.of("../word-counter/someWords.txt");
        String someWordsFile = Files.readString(filePath);
        String someWordsResult = "There are " + wordCounter(someWords) + " words in the string someWords";
        String someWordsFileResult = "There are " + wordCounter(someWordsFile) + " words in the file someWords.txt";

        System.out.println("I can count the words in the string: someWords, \nin the file: someWords.txt," +
                " \nand in the words you type.");
        System.out.println();
        System.out.println(someWordsResult);
        System.out.println(someWordsFileResult);

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Type some words and I will count them.");
        String someWordsTyped = input.nextLine();
        String someWordsTypedResult = "You just typed " + wordCounter(someWordsTyped) + " word[s].";
        System.out.println(someWordsTypedResult);
        input.close();
    }
}