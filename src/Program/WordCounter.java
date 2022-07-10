package Program;

public class WordCounter {
    public static int wordCounter(String words){
        String noPunct = words.replaceAll("\\p{Punct}", "");
        String[] wordsSplit = noPunct.split(" ");
        //System.out.println(words);

        int wordNumber= 0;
        for (int i=0; i<wordsSplit.length;i++) {
            wordNumber++;
        }
        return wordNumber;
    }

}
