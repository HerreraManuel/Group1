import GitParser.*;
import Metrics.*;
import java.io.*;
import java.util.*;

class Grabber implements Retrievable {

    int numFiles = 0;

    public Grabber (String inputURl, String[] searchCriteria){

    }

    public boolean isSuffix(String suffix) {
        if (suffix.contains(".java") || suffix.contains(".c") || suffix.contains(".h") || suffix.contains(".cpp") || suffix.contains(".hpp") || suffix.contains(".txt")) {
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
    public int[] getCharacterCount() {
        Characters charCount = new Characters();
        return null;
    }

    @Override
    public int[] getWordCount() {
        Words wordCount = new Words();
        return null;
    }

    @Override
    public int[] getLineCount() {
        Lines lineCount = new Lines();
        return null;
    }

    @Override
    public int[] getSourceCount() {
        SourceLine sourceCount = new SourceLine();
        return null;
    }

    @Override
    public int[] getCommentCount() {
        return null;
    }


    public String [] [] getCompleteFile(){
        String [][] completeFile = new String [6][numFiles];



        return completeFile;
    }

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
