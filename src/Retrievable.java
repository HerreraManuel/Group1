import GitParser.*;

public class Grabber implements Retrievable {

}

public interface Retrievable {


    boolean isURL(String path);
    boolean isSuffix();

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
