package Metrics;

public class Words {

    public void wordCount(String fileContent) {

    int words;
    String [] wordKeeper;

        wordKeeper = fileContent.trim().split("\\s+");
        words = wordKeeper.length;

     }

}
