package Metrics;

import java.io.File;
import java.nio.file.Files;

public class SourceLine {

    String fileExt;

    public void sourceline(String fileContent){

        int sourceCount = 0;

    }

    // Tester for source lines output.
    public static void main(String[] args){
        File[] files = new File("C:/Users/Desktop/CSC131/").listFiles();
        showFiles(files);
    }

    public static void showFiles(File[] files){
        for (File file: files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                showFiles(file.listFiles());
            } else {
                System.out.println("File: " + file.getName());
            }
        }
    }

    public boolean isJava(File tempFile){
        fileExt = tempFile.getName().substring
                (tempFile.getName().lastIndexOf("."));
        return fileExt.equals(".java");
    }

    public boolean isCppOrC(File tempFile){
        fileExt = tempFile.getName().substring
                (tempFile.getName().lastIndexOf("."));
        if (fileExt.equals(".h") || fileExt.equals(".cpp") ||
                fileExt.equals(".h") || fileExt.equals("hpp"))
            return true;
        return false;
    }



}


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