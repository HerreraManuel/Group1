import GitParser.*;

class Grabber implements Retrievable {
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
    public int getCharacterCount() {
        return 0;
    }

    @Override
    public int getWordCount() {
        return 0;
    }

    @Override
    public int getLineCount() {
        return 0;
    }

    @Override
    public int getSourceCount() {
        return 0;
    }

    @Override
    public int getCommentCount() {
        return 0;
    }

    @Override
    public int getTotalCharacter() {
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
