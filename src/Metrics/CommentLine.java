package Metrics;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentLine{

    public int commentLine(String fileContent) {
        int commentLine = 0;
        String[] lineKeeper;
        lineKeeper = fileContent.split(("\\r?\\n"));
        Pattern pattern1 = Pattern.compile("(?s)/\\*.*?\\*/");
        Pattern pattern2 = Pattern.compile("(//.*?$) | (/\\*.*?\\*/)",
                Pattern.MULTILINE | Pattern.DOTALL);
        for(String singleLine : lineKeeper){
            while(singleLine != null){
                Matcher m;
                Matcher m2;
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