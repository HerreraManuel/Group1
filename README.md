# &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Software Requirements Specification
[]()\
[]()

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Github Metrics application
[]()\
[]()
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Group 1
##### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jenzel Arevalo
##### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Parambir Gill
##### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Manuel Herrera
##### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Matthew Mendoza
##### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jarod Nooner
[]()\
[]()
### CSC 131 - Software Engineering


*** 

### Table of Contents

1. [Introduction](#intro)\
    1.1 [Purpose](#purpose)\
    1.2 [Scope](#scope)\
    1.3 [Definitions](#def)\
    1.4 [References](#ref)\
    1.5 [Overview](#overview)
2. [Overall Description](#overalldesc)\
    2.1 [Product Perspective](#procper)\
    2.2 [Product Functions](#procfunc)\
    2.3 [User Characteristics](#userchar)\
    2.4 [General Constraints](#gencons)\
    2.5 [Assumptions and Dependencies](#assumdepend)
3. [Detailed Requirements](#detailreq)\
    3.1 [External Interface Requirements](#extinterfacereq)\
    3.2 [Functional Requirements](#funcreq)\
    3.3 [Performance Requirements](#perfreq)\
    3.4 [Design Constraints](#descon)\
    3.5 [Attributes](#attri)\
    3.6 [Other Requirements](#otherreq)
***
    
<a name="intro"></a>
### 1.Introduction:
<a name="purpose"></a>
##### 1.1 Purpose
    This Windows Desktop Application will allow the programmer to
    check the character count, word count, line count, comment
    count, and source line of code count by providing the
    Git URL along with the file type. The user is able to select
    which count they would like to view by clicking the appropriate 
    check boxes listed.
<a name="scope"></a>
##### 1.2 Scope
    The user can only ask for the metrics listed above. They are
    limited to C/C++ and Java files. They may only enter one URL at a time.
    Only git repositories will be assessed for the given choice of metrics.
<a name="def"></a>    
##### 1.3 Definitions
    Characters: Counts the number of characters in a given file.
    Words: Counts the words in a given file.
    Lines: Counts the number of lines in a given file.
    Source Lines: Counts the number of source lines in a given file.
    Comment Lines: Counts the number of comments in a given file.
<a name="ref"></a>
##### 1.4 References
    An external library called JGit was used for its ability to clone a
    repository from Git. This will allow us to pull all files from the given
    Git url and save it to a destination. 
<a name="overview"></a>    
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

    
<a name="overalldesc"></a>
### 2. Overall Description
<a name="procper"></a>
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
<a name="procfunc"></a>
##### 2.2 Product Functions
    Within the GUI application, the user input a valid GitHub repository URL and will 
    be able to request metrics from a GitHub.
    
    Returned results will display on right side of the application in a table list format.
    If the amount of files exceeds normal display, the window will be scrollable to view
    more files and their metrics. List of metrics will be the rows and the files from the
    repository will be the columns. A static end-column will exists for quick view of the
    totals for each metrics.  
<a name="userchar"></a>
##### 2.3 User Characteristics
    There is _____ users. A GUI application user.
    
    The GUI application user can only use the application to request metrics. Therefore,
    the user will need to insert a valid GitHub URL and check which metrics they want 
    returned from the repository's files. 
<a name="gencons"></a>    
##### 2.4 General Constraints
    The GUI application is constrained by the languages it can read. Therefore, if the
    user requests specific language metrics, it will only return the ones the system
    can read.
    
    Another constraint in an internet connection. The application pulls the requested
    repository from GitHub's database and it's necessary the system is connected to 
    the internet for application to function.
    
    The application will be contstrained by GitHubs database and may be forced to queue 
    incoming request. It will either timeout and if repository is large, it will increase
    the time to retreive data.
<a name="assumdepend"></a>    
##### 2.5 Assumptions and Dependencies
    One assumption is the user will have enough hardware memory to store the temporary
    files while the application runs its metrics. If the application does not have
    enough memory, the user will be requested to make room before the application runs.
    There may exist scenarios where the application does not run or work as it should.

<a name="detailreq"></a>
### 3. Detailed  Requirements         
<a name="extinterfacereq"></a>
##### 3.1 External Interface Requirements
    3.1.1 User Interfaces -> TO BE WORKED ON
            Every user will see where they can insert a valid GitHub repository
            URL. Underneath the URL input box, the user can set which metrics to run on
            the files.
    3.1.2 Hardware Interfaces
            There is no direct hardware interface because the application has no
            designated hardware. The database server is managed by GitHub.
    3.1.3 Software Interfaces
    3.1.4 Communication Interfaces
<a name="funcreq"></a>            
##### 3.2 Functional Requirements
        3.2.1 Mode 1  *** change these later to incorporate Use Cases 
        
        3.2.1.1 Functional Requirement 1.1 
             The system will take in a GitHub URL
             
        3.2.1.2 Functional Requirement 1.2
              The system will take in the file type
       
        3.2.1.3 Funcrional Requirement 1.2
             Calculate the chosen metric by the user
                 3.2.1.3a Will provide the Character Count of a file
                 3.2.1.3b Will provide the Word Count of a file
                 3.2.1.3c Will provide the Line Count of a file
                 3.2.1.3d Will provide the Comment Count of a file
                 3.2.1.3e Will provide the Source Line Count of a file
<a name="perfreq"></a>       
##### 3.3 Performance Requirements
         3.3.1 Prominent URL Search 
            Title: Prominent URL Search
             Desc: Where to enter the URL should be easy to find for the user.
          
          3.3.2 Prominent File Type Search
              Title: Prominent File Type Search
               Desc: Where to indicate the file type should be easy to find for the user
               
          3.3.3 Usage of Metrics Check Boxes
              Title: Usage of Metrics Check Boxes
               Desc: The check boxes should be clear in representing the chosen metric
<a name="descon"></a>         
##### 3.4 Design Constraints
    3.4.1 Software Language
            The language used will be in Java
    3.4.2 Standard Development Tools
    3.4.3 External Libraries
            System was built using external libraries that conforms
            to the developers standards.      
<a name="attri"></a>                 
##### 3.5 Attributes
    INSERT INFORMATION
<a name="otherreq"></a>
##### 3.6 Other Requirements
    INSERT INFORMATION
    