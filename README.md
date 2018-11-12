# Software Requirements Specification



### Github Metrics Application
### Version 0.5
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
##### 2.1 Product
**Relationship of the product to other products; defining if the product is 
independent or is a part of a larger product, and what the principal interfaces 
of the product are** \
 The system consists of a single entity. A Java GUI application will be used to
 present metrics from valid Github repositories.
##### 2.2 Product Functions
##### 2.3 User Characteristics
##### 2.4 General Constraints

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
