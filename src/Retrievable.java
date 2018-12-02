import GitParser.*;

class Grabber implements Retrievable {
    public boolean isSuffix(String suffix) {
        if (suffix.contains(".java") || suffix.contains(".c") || suffix.contains(".h") || suffix.contains(".cpp") || suffix.contains(".hpp")) {
            return true;
        } else { return false; }
    }

    @Override
    public boolean isURL(String path) {
        return false;
    }
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
