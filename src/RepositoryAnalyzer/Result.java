/***********************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Results class stores the results of the line count for each File in an attempt to make it easier
 for the front-end to retrieve the data of a file.
 **********************************************************************************************/

package RepositoryAnalyzer;

import java.io.File;

public class Result
{
  private String fileName;
  private Integer characterCount;
  private Integer wordCount;
  private Integer lineCount;
  private Integer sourceCount;
  private Integer commentCount;

  public void Result(String fileName, Integer characterCount, Integer wordCount, Integer lineCount, Integer sourceCount, Integer commentCount)
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
}
