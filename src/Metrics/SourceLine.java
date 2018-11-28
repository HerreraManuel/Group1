package Metrics;

import java.io.BufferedReader;
import java.io.IOException;


public class SourceLine {

    String fileExt;

    public int sourceline(String fileContent){
        return 0;
    }

    // gets source line count and comment line count
    public void sourceCount(BufferedReader buff) throws IOException {
        }
}

// Matthews Code Below
/*
    public void sourceline(String fileContent){
        try{
            Scanner yk = new Scanner(fileContent);
            int sourceCount = 0;
            String s = "";
            char bracket;
            boolean bracketOrComment;
            while(yk.hasNextLine()){
                bracketOrComment = false;
                s = yk.nextLine();
                String sTrim = s.trim();
                if(sTrim.length() >= 1){
                    bracket = sTrim.charAt(0);
            if(bracket == '}' && sTrim.length() <= 1){ // Assuming that SLOC doesn't take end brackets
            bracketOrComment = true;
            }
                }
                if(sTrim.length() >= 2){
                    bracket = sTrim.charAt(0);
                    char commentNext =  sTrim.charAt(1);
                    if(bracket == '/' && commentNext == '/'){
                        bracketOrComment = true;
                    }
                }
                for(int i = 0; i <= sTrim.length() - 1; i++){
                    char com =  sTrim.charAt(i);
                    if(i != sTrim.length() - 1){
                        char comNext =  sTrim.charAt(i + 1);
                        if(com == '/' && comNext == '*'){
                            bracketOrComment = true;
                            Boolean sourceChecker = true;
                            while(sourceChecker == true){
                                while(yk.hasNextLine()){
                                    if(sourceChecker == false){
                                        break;
                                    }
                                    String innerComment = yk.nextLine();
                                    for(int j = 0; j <= innerComment.length() - 1; j++){
                                        char innerCom = innerComment.charAt(j);
                                        if(j != innerComment.length() - 1){
                                            char innerComNext = innerComment.charAt(j + 1);
                                            if(innerCom == '*' && innerComNext == '/'){
                                                sourceChecker = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if(sTrim.length() >= 3){
                                bracketOrComment = false;
                            }
                        }
                    }
                }
                if(bracketOrComment == false){
                    if(!(sTrim.isEmpty())){
                        sourceCount++;
                    }
                }
            }
            return sourceCount;
        } catch(FileNotFoundException e){
            System.out.println("File not found");
            return 0;
        }
    }
}
*/