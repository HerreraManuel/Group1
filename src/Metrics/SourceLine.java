package Metrics;

import java.io.File;

public class SourceLine {

    String fileExt;

    public void sourceline(String fileContent){

        int sourceCount = 0;

    }

    // Tester for source lines output.
    public static void Main(String[] args){

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
