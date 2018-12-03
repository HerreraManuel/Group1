import GitParser.*;
import com.jcraft.jsch.IO;

import java.io.*;
import java.util.*;

class Grabber  implements Retrievable {
    String currentURL = new String();

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
    public boolean isURL(String path) {
        return false;
    }

    @Override
    public int[] getCharacterCount( ){
        return null;
    }

    @Override
    public int[] getWordCount() {
        return null;
    }

    @Override
    public int[] getLineCount() {
        return null;
    }

    @Override
    public int[] getSourceCount( ){
        return null;
    }

    @Override
    public int[] getCommentCount() {
        return null;
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

    int[] getCharacterCount();
    int[] getWordCount();
    int[] getLineCount();
    int[] getSourceCount();
    int[] getCommentCount();

//    int getTotalCharacter();
//    int getTotalWord();
//    int getTotalLine();
//    int getTotalSource();
//    int getTotalComment();

}
