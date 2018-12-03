/******************************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Simple helper class to hold lists of different types of extensions. FileExtensions class implemented
 with consideration of future additions and ease of implementing new extensions to program

 ****************************************************************************************************/

package RepositoryAnalyzer;

import java.util.ArrayList;

public class FileExtensions
{
  private ArrayList<String> sourceExtensions;       // an arraylist for source file extensions
  private ArrayList<String> textExtensions;         // an arraylist for generic text extensions

  public FileExtensions()
  {
      addSourceExtensions();
      addTextExtensions();
  }

  /* Automatically adds extensions to sourceExtensions arraylist */
  private void addSourceExtensions()
  {
      sourceExtensions.add(".java");
      sourceExtensions.add(".c");
      sourceExtensions.add(".cpp");
      sourceExtensions.add(".h");
  }

  /* Automatically adds extensions to sourceExtensions arraylist */
  private void addTextExtensions()
  {
      textExtensions.add(".txt");
      textExtensions.add(".md");
  }

  /* Returns a text extension at a given index */
  public String getTextExtensions(int i)
  {
      return textExtensions.get(i);
  }

  /* Returns a source extension at a given index */
  public String getSourceExtensions(int i)
  {
      return sourceExtensions.get(i);
  }

  /* Returns size of text extensions arraylist */
  public int getTextExtensionsSize()
  {
      return textExtensions.size();
  }

  /* Returns size of source extensions arraylist */
  public int getSourceExtensionsSize()
  {
      return sourceExtensions.size();
  }
}
