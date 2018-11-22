package Metrics;

import java.io.*;
import java.util.*;

public class CommentLine{

}


/*
public class CommentLine {

    public void commentline(String fileContent){
        try{
            int commentCount = 0;
            Scanner bk = new Scanner(fileContent);
            String comment = "";
            Boolean commentChecker;
            while(bk.hasNextLine()){
                comment = bk.nextLine();
                for(int i = 0; i <= comment.length() - 1; i++){
                    char com =  comment.charAt(i);
                    if(i != comment.length() - 1){
                        char comNext =  comment.charAt(i + 1);
                        if(com == '/' && comNext == '/'){
                            commentCount++;
                        }

                        if(com == '/' && comNext == '*'){
                            commentCount++;
                            commentChecker = true;
                            while(commentChecker == true){
                                while(bk.hasNextLine()){
                                    if(commentChecker == false){
                                        break;
                                    }
                                    String innerComment = bk.nextLine();
                                    commentCount++;
                                    for(int j = 0; j <= innerComment.length() - 1; j++){
                                        char innerCom = innerComment.charAt(j);
                                        if(j != innerComment.length() - 1){
                                            char innerComNext = innerComment.charAt(j + 1);
                                            if(innerCom == '*' && innerComNext == '/'){
                                                commentChecker = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return commentCount;
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            return 0;
        }
    }
}
*/