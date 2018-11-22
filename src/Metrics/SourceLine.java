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
