package Metrics;


import java.util.regex.Pattern;

public class CommentLine{

    public int commentLine(String fileContent) {
        int commentLine = 0;
        String[] lineKeeper;
        lineKeeper = fileContent.split(("\\r?\\n"));
        Pattern pattern1;
        Pattern pattern2;
        for(String singleLine : lineKeeper){
            while(singleLine != null){

            }
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