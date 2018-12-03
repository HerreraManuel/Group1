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
  private Integer characterCount;
  private Integer wordCount;
  private Integer lineCount;
  private Integer sourceCount;
  private Integer commentCount;

  //TODO: Is it really a good idea to pass in all the parameters to this constructor?
  public Result(String fileName, Integer characterCount, Integer wordCount, Integer lineCount, Integer sourceCount, Integer commentCount)
  {
      setFileName(fileName);
      setCharacterCount(characterCount);
      setWordCount(wordCount);
      setLineCount(lineCount);
      setSourceCount(sourceCount);
      setCommentCount(commentCount);
  }

  /* Sets the file name */
  public void setFileName(String fileName)
  {
      this.fileName = fileName;
  }

  /* Sets the character count */
  public void setCharacterCount(Integer characterCount)
  {
      this.characterCount = characterCount;
  }

  /* Sets the word count */
  public void setWordCount(Integer wordCount)
  {
    this.wordCount = wordCount;
  }

  /* Sets the line count */
  public void setLineCount(Integer lineCount)
  {
    this.lineCount = lineCount;
  }

  /* Sets the source count if possible for file type */
  public void setSourceCount(Integer sourceCount)
  {
    if(sourceCount == null)
      this.sourceCount = null;
    else
      this.sourceCount = sourceCount;
  }

  /* Sets the comment count, if possible for file type */
  public void setCommentCount(Integer commentCount)
  {
    if(commentCount == null)
      this.commentCount = null;
    else
      this.commentCount = commentCount;
  }

  /* To-String method for debugging */
  public String toString()
  {
    String s = "";
    s += "File Name: " + fileName + "\n";
    s += "Character Count: " + characterCount + "\n";
    s += "Word Count: " + wordCount + "\n";
    s += "Line Count: " + lineCount + "\n";
    if(sourceCount == null && commentCount == null)
    {
      s += "Source Count: Not available for file\n";
      s += "Comment Count: Not available for file\n";
    }
    else
    {
      s += "Source Count: " + sourceCount + "\n";
      s += "Comment Count: " + commentCount + "\n";
    }
    return s;
  }
}
