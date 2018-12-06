/***********************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Results class stores the results of the line count for each File in an attempt to make it easier
 for the front-end to retrieve the data of a file.
 **********************************************************************************************/

package RepositoryAnalyzer;

public class Result
{
  private String fileName;
  private int characterCount;
  private int wordCount;
  private int lineCount;
  private int sourceCount;
  private int commentCount;

  //TODO: Is it really a good idea to pass in all the parameters to this constructor?
  public Result(String fileName, int characterCount, int wordCount, int lineCount, int sourceCount, int commentCount)
  {
      setFileName(fileName);
      setCharacterCount(characterCount);
      setWordCount(wordCount);
      setLineCount(lineCount);
      setSourceCount(sourceCount);
      setCommentCount(commentCount);
  }

  /* Sets the file name */
  private void setFileName(String fileName)
  {
      this.fileName = fileName;
  }

  /* Sets the character count */
  private void setCharacterCount(int characterCount)
  {
      this.characterCount = characterCount;
  }

  /* Sets the word count */
  private void setWordCount(int wordCount)
  {
    this.wordCount = wordCount;
  }

  /* Sets the line count */
  private void setLineCount(int lineCount)
  {
    this.lineCount = lineCount;
  }

  /* Sets the source count if possible for file type */
  private void setSourceCount(int sourceCount)
  {
      this.sourceCount = sourceCount;
  }

  /* Sets the comment count, if possible for file type */
  private void setCommentCount(int commentCount)
  {
      this.commentCount = commentCount;
  }

  /* Gets the file name */
  public String getFileName()
  {
    return fileName;
  }

  /* Gets the character count */
  public int getCharacterCount()
  {
    return characterCount;
  }

  /* Gets the word count */
  public int getWordCount()
  {
    return wordCount;
  }

  /* Gets the line count */
  public int getLineCount()
  {
    return lineCount;
  }

  /* Gets the source count */
  public int getSourceCount()
  {
    return sourceCount;
  }

  /* Gets the comment count */
  public int getCommentCount()
  {
    return commentCount;
  }

  /* To-String method for debugging */
  public String toString()
  {
    String s = "";
    s += "File Name: " + fileName + "\n";
    s += "Character Count: " + characterCount + "\n";
    s += "Word Count: " + wordCount + "\n";
    s += "Line Count: " + lineCount + "\n";
    s += "Source Count: " + sourceCount + "\n";
    s += "Comment Count: " + commentCount + "\n";
    return s;
  }
}
