import GitParser.*;
import Metrics.*;
import java.io.*;
import java.util.*;

class Grabber implements Retrievable {

    private String path;

    public Grabber(String path){
        this.path = path;
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
    public int getCharacterCount() {
        Characters chars = new Characters();
        int charCount = chars.characterCount(path);
        return charCount;
    }

    @Override
    public int getWordCount() {
        Words wordCount = new Words();
        return wordCount;
    }

    @Override
    public int getLineCount() {
        Lines lineCount = new Lines();
        return lineCount;
    }

    @Override
    public int getSourceCount() {
        SourceLine sourceCount = new SourceLine();
        return sourceCount;
    }

    @Override
    public int getCommentCount() {
        return 0;
    }

    @Override
    public int getTotalCharacter() {
        return 0;
    }

    @Override
    public int getTotalWord() {
        return 0;
    }

    @Override
    public int getTotalLine() {
        return 0;
    }

    @Override
    public int getTotalSource() {
        return 0;
    }

    @Override
    public int getTotalComment() {
        return 0;
    }

}

public interface Retrievable {


    boolean isURL(String path);
    boolean isSuffix(String suffix);

    int getCharacterCount();
    int getWordCount();
    int getLineCount();
    int getSourceCount();
    int getCommentCount();

    int getTotalCharacter();
    int getTotalWord();
    int getTotalLine();
    int getTotalSource();
    int getTotalComment();

}
