package Program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordCounter {
    public static int wordCounter(String words) throws IOException {
        String noPunct = words.replaceAll("\\p{Punct}", "");
        String[] wordsSplit = noPunct.toLowerCase().split(" ");
        Path englishWordsPath = Path.of("../word-counter/englishWords.txt");
        String englishWordsFile = Files.readString(englishWordsPath);
        String[] englishWordsSplit = englishWordsFile.toLowerCase().split("\n");

        int wordNumber= 0;
        for (int i=0; i<wordsSplit.length;i++) {
            for (int j=0; j<englishWordsSplit.length;j++) {
                if (englishWordsSplit[j].equals(wordsSplit[i])) {
                    wordNumber++;
                }
            }
        }
        return wordNumber;
    }

}
