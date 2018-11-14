# Software Requirements Specification



### Github Metrics Application
### Version 0.8
### Group 1

#### Jenzel Arevalo
#### Parambir Gill
#### Manuel Herrera
#### Matthew Mendoza
#### Jared Nooner


### CSC 131 - Software Engineering

### 1.Introduction:

##### 1.1 Purpose
    This Windows Desktop Application will allow the programmer to
    check the character count, word count, line count, comment
    count, and source line of code count by providing the
    Git URL along with the file type. The user is able to select
    which count they would like to view by clicking the appropriate 
    check boxes listed.

##### 1.2 Scope
    The user must use a Windows Machine to run the program. 
    The user can only ask for the metrics listed above. They are
    limited to C/C++ and Java files. They may only enter one URL at a time.
    Only git repositories will be assessed for the given choice of metrics.
    

##### 1.3 Definitions
    Characters: Counts the number of characters in a given file.
    Words: Counts the words in a given file.
    Lines: Counts the number of lines in a given file.
    Source Lines: Counts the number of source lines in a given file.
    Comment Lines: Counts the number of comments in a given file.

##### 1.4 References
    An external library called JGit was used for its ability to clone a
    repository from Git. This will allow us to pull all files from the given
    Git url and save it to a destination. 
    
##### 1.5 Overview

    The following are enclosed files: Dashboard.java, GitParser.java, Helper.java

    Dashboard.java is the GUI that will be the used to access the
    GitParser and display the output. It will take a Github url and
    have check boxes to set what information will be displayed on
    the other side of the window.In order to ensure the largest
    possible output, the window will be set to the size of the screen.
    
    GitParser will.....
    
    Helper.java will.....

    Design Goals: <---- find a place to put this
    Expected customer is a computer programmer who likely uses git
    or an instructor looking to view the metrics on a student's
    repostitory.

    

### 2. Overall Description
##### 2.1 Product Perspective
    The system consists of a single entity. A Java GUI application will be used to
    present metrics from valid Github repositories. 
 
    The GUI application will communicate with the GitHub and download the repository
    from the GitHub database.
 
    The download files from the database will be stored in a local folder of the 
    user. The GUI application will not modify the files but will run metrics requested.
    Communication between the GUI application and database will be over the internet.
    The GUI application will only be allowed to store temporary files and will delete
    the local repository once done. Resource allocation is to be determined.
##### 2.2 Product Functions
    Within the GUI application, the user input a valid GitHub repository URL and will 
    be able to request metrics from a GitHub.
    
    Returned results will display on right side of the application in a table list format.
    If the amount of files exceeds normal display, the window will be scrollable to view
    more files and their metrics. List of metrics will be the rows and the files from the
    repository will be the columns. A static end-column will exists for quick view of the
    totals for each metrics.  
##### 2.3 User Characteristics
    There is _____ users. A GUI application user.
    
    The GUI application user can only use the application to request metrics. Therefore,
    the user will need to insert a valid GitHub URL and check which metrics they want 
    returned from the repository's files. 
##### 2.4 General Constraints
    The GUI application is constrained by the languages it can read. Therefore, if the
    user requests specific language metrics, it will only return the ones the system
    can read.
    
    Another constraint in an internet connection. The application pulls the requested
    repository from GitHub's database and it's necessary the system is connected to 
    the internet for application to function.
    
    The application will contstrained by GitHubs database and may be forced to queue 
    incoming request. It will either timeout and if repository is large, it will increase
    the time to retreive data.
##### 2.5 Assumptions and Dependencies
    One assumption is the user will have enough hardware memory to store the temporary
    files while the application runs its metrics. If the application does not have
    enough memory, the user will be requested to make room before the application runs.
    There may exist scenarios where the application does not run or work as it should.
### 3. Detailed  Requirements         
##### 3.1 External Interface Requirements
    3.1.1 User Interfaces
    3.1.2 Hardware Interfaces
    3.1.3 Software Interfaces
    3.1.4 Communication Interfaces
##### 3.2 Functional Requirements
##### 3.3 Performance Requirements
##### 3.4 Design Constraints
##### 3.5 Attributes
##### 3.6 Other Requirements
