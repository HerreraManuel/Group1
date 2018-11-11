# Software Requirements Specification

--- 

### Github Metrics Application


#### Jenzel Arevalo
#### Parambir Gill
#### Manuel Herrera
#### Matthew Mendoza
#### Jared Nooner



***

1.Introduction:

1.1 Purpose
    This Windows Application will allow the programmer to be able
    check the character count, word count, line count, comment
    count, and source line of code count by simply providing the
    git URL along with what file type.
    The user is able to select which count they would like to view
    by clicking on the check boxes listed.

1.2 Scope
    The user can only ask for the metrics from the list above. They are
    limited to C/C++ and Java files. They may only enter one URL at a time.

1.3 Definitions
    Characters: Counts the number of characters in a given file.
    Words: Counts the words in a given file.
    Lines: Counts the number of lines in a given file.
    Source Lines: Counts the number of source lines in a given file.
    Comment Lines: Counts the number of comments in a given file.

1.4 References
    An external library called JGit was used for its ability to clone a
    repository from Git. This will allow us to pull all files from the given
    Git url and save it to a destination.
    
Overview:

enclosed files: Dashboard.java , GitParser.java , Helper.java

Dashboard.java is the GUI that will be the used to access the
GitParser and display the output.

Design Goals:

Expected customer is a computer programmer who likely uses git
or an instructor looking to view the metrics on a student's 
repostitory. 

Dashboard.java is going to be able to intake a github url and
have check boxes to set what information will be displayed on 
the other side of the window.In order to ensure the largest 
possible output the window will be set to the size of the screen