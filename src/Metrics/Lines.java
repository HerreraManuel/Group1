package Metrics;

public class Lines {

    public int lineCount(String fileContent) {

        int lines;
        String [] lineKeeper;
        lineKeeper = fileContent.split(("\\r?\\n"));
        lines = lineKeeper.length;
        return lines;
    }

}
