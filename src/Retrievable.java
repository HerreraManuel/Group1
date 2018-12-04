public interface Retrievable
{


    boolean isURL(String path);
    boolean isSuffix(String suffix);

    int[] getCharacterCount();
    int[] getWordCount();
    int[] getLineCount();
    int[] getSourceCount();
    int[] getCommentCount();

    String[] getFileNames();
}
