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

    public int getNumFiles(){
        return numFiles;
    }

    @Override
    public String[] getFileNames() {
        return new String[0];
    }

    public String [] [] getCompleteFile(){
        String [][] completeFile = new String [6][numFiles];
        String [] fileNames = getFileNames();
        int[] characters = getCharacterCount();
        int[] words = getWordCount();
        int[] lines = getLineCount();
        int[] sourceLines = getSourceCount();
        int[] commentLines = getCommentCount();

        for (int i = 0; i < numFiles;i++){
            completeFile[0][i] = fileNames[i];
            completeFile[1][i] = characters.toString();
            completeFile[2][i] = words.toString();
            completeFile[3][i] = lines.toString();
            if(sourceLines[i] >= 0 ) {
                completeFile[4][i] = sourceLines.toString();
            }else{
                completeFile[4][i] = "N/A";
            }
            if(commentLines[i] >= 0) {
                completeFile[5][i] = commentLines.toString();
            }else{
                completeFile[5][i] = "N/A";
            }
        }
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

    String [][] getCompleteFile();
    int getNumFiles();
    String [] getFileNames();


}
