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
        String singleLine;
        for (int i = 0; i < lineKeeper.length; i++) {
            singleLine = lineKeeper[i];
            Matcher m1 = pattern1.matcher(singleLine);
            Matcher m2 = pattern2.matcher(singleLine);
            if (singleLine.contains("/*") && singleLine.contains("*/")) {
                commentLine++;
            }
            // reading multi-line comments
            else if (singleLine.contains("/*")) {
                commentLine++;
                while (!singleLine.contains("*/")) {
                    commentLine++;
                    if (singleLine.contains("*/")) commentLine++;
                    singleLine = lineKeeper[i++];
                }
            } else {
                // finding single lines
                if (singleLine.contains("//")) commentLine++;
                // while (m1.find()) commentLine++;
                // while (m2.find()) commentLine++;
            }
        }
        return commentLine;
    }
}