package Metrics;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentLine{

    public int commentLine;

    public int commentLine(String fileContent) {
        commentLine = 0;
        String[] lineKeeper;
        lineKeeper = fileContent.split(("\\r?\\n"));
        Pattern pattern1 = Pattern.compile("(?s)/\\*.*?\\*/");
        Pattern pattern2 = Pattern.compile("(//.*?$) | (/\\*.*?\\*/)",
                Pattern.MULTILINE | Pattern.DOTALL);
        for(String singleLine : lineKeeper){
                Matcher m1 = pattern1.matcher(singleLine);
                Matcher m2 = pattern2.matcher(singleLine);
                if (singleLine.contains("/*") && singleLine.contains("*/")) {
                    commentLine++;
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