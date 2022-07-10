package Program;

import java.util.Arrays;

public class WordCounter {
    public static int wordCounter(String words){
        String noPunct = words.replaceAll("\\p{Punct}", "");
        String[] wordsSplit = noPunct.split(" ");
        int wordNumber= 0;
        for (int i=0; i<wordsSplit.length;i++) {
            wordNumber++;
            //System.out.println(wordsSplit[i]);
        }
        //System.out.println(Arrays.toString(wordsSplit));
        //System.out.println(wordNumber);
        return wordNumber;
    }

}
