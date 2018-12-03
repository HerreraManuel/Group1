import GitParser.*;
import com.jcraft.jsch.IO;

import java.io.*;
import java.util.*;

class Grabber  implements Retrievable {
    String currentURL = new String();
    String [] fileNames = null;
    int[] characterCount = null;
    int[] wordCount = null;
    int[] linecount = null;
    int[] sourceCount = null;
    int[] commentCount = null;
    int numfiles = 0;

    public Grabber (String URLinput) throws IOException {
        currentURL = URLinput;
        if(isURL(URLinput)){

        }
        else{
            throw new IOException();
        }
    }

    public boolean isSuffix(String suffix) {
        if (suffix.contains(".java") || suffix.contains(".c") || suffix.contains(".h") || suffix.contains(".cpp") || suffix.contains(".hpp")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] getFileNames() {
        return new String[0];
    }

    @Override
    public boolean isURL(String path) {
        return false;
    }

    @Override
    public void getCharacterCount( ){

    }

    @Override
    public void getWordCount() {

    }

    @Override
    public void getLineCount() {

    }

    @Override
    public void getSourceCount( ){

    }

    @Override
    public void getCommentCount() {

    }

    public String [][] getCompleteFile(){
        String[][] completeFile = new String[6][numfiles];


        for (int i =0 ; i < numfiles ; i++)
        {
            completeFile[0][i] = fileNames[i];
            completeFile[1][i] = Integer.toString(characterCount[i]);
            completeFile[2][i] = Integer.toString(wordCount[i]);
            completeFile[3][i] = Integer.toString(linecount[i]);
            completeFile[4][i] = Integer.toString(sourceCount[i]);
            completeFile[5][i] = Integer.toString(commentCount[i]);
        }

        return completeFile;
    }

//    @Override
//    public int getTotalCharacter() {
//        return 0;
//    }
//
//    @Override
//    public int getTotalWord() {
//        return 0;
//    }
//
//    @Override
//    public int getTotalLine() {
//        return 0;
//    }
//
//    @Override
//    public int getTotalSource() {
//        return 0;
//    }
//
//    @Override
//    public int getTotalComment() {
//        return 0;
//    }

}

public interface Retrievable {


    boolean isURL(String path);
    boolean isSuffix(String suffix);

    String [] getFileNames();
    void getCharacterCount();
    void getWordCount();
    void getLineCount();
    void getSourceCount();
    void getCommentCount();

//    int getTotalCharacter();
//    int getTotalWord();
//    int getTotalLine();
//    int getTotalSource();
//    int getTotalComment();

}
