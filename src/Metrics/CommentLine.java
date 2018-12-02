package Metrics;


public class CommentLine{

    public int commentLine(String fileContent) {
        int commentLine = 0;
        String[] lineKeeper;
        lineKeeper = fileContent.split(("\\r?\\n"));
        for(String singleLine : lineKeeper){

        }
        return commentLine;
    }

    public boolean commentBegan(String line){

        return false;
    }

    public boolean commentEnded(String line){
        return false;
    }


}