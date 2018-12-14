# &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Software Requirements Specification
[]()\
[]()
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Github Metrics Application
[]()\
[]()
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Group 1
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jenzel &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Arevalo
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Parambir &nbsp;Gill
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Manuel &nbsp;&nbsp;&nbsp;&nbsp;Herrera
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Matthew &nbsp;&nbsp;Mendoza
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jerod &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Nooner
[]()\
[]()
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CSC 131 - Software Engineering

*** 

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Table of Contents

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
***
&nbsp;
    
<a name="intro"></a>
### 1.Introduction:
<a name="purpose"></a>
##### 1.1 Purpose
    This Windows Desktop Application will allow the programmer to
    check the character count, word count, line count, comment
    count, and source line of code count by providing the
    Github URL along with the file type. The user is able to select
    which count they would like to view by clicking the appropriate 
    check boxes listed.
<a name="scope"></a>
##### 1.2 Scope
    The user can only ask for the metrics listed above. They are
    limited to C/C++, Java, and text files. The user can only enter one
    link at a time. Only git repositories will be assessed for the given choice of
    metrics. CommentLine class will only be able to identify C/C++ and Java
    indications of comments. Valid suffixes include .java, .c, .h, .cpp, .hpp,
    .txt. If an improper URL link or suffix was inputted the user will be prompted
    an error message.
<a name="def"></a>    
##### 1.3 Definitions
    URL: Takes Github URL(s).
    Suffix: The file extension that is meant to be read.
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

    Dashboard.java is the GUI that will be the used to access the GitParser and display the output. It will take a 
    Github url and  have check boxes to set what information will be displayed on the other side of the window.In 
    order to ensure the user can look at other windows while running this program, the window will be set to a 
    smaller size. 
    
    GitParser package holds all the java files necessary for cloning and creating a repository for our group to 
    utilize. This package includes the following files:
    
        Git Cloner - Class that clones a repository with a given URL.
        
        Repository - Class that holds a repository in a File object. This class has some useful methods such as 
        ls() for printing all the contents of the repository and getAllFiles() for getting all files in the 
        repository and saving them in a Queue data structure.
        
        GitParser - Main driver for this package. This class utilizes both GitCloner and Repository class to clone 
        a repo with a given URL and store that repo in a Repository object.
        
        GitParserException - Custom exception class to indicate if there is an error that had occurred during the 
        git parsing process. 
        
    Helper package holds some class's files whose purpose is used throughout the back end of the program. The classes 
    within this package help make the construction of the program easier. This package includes the following files:
    
        FileExtensions - Class that holds two arraylist data structures. One which holds a list of source file 
        extensions (.cpp, .hpp, .java, .c, etc.) and another list for generic text file extensions(.txt). Intention 
        of this class was to help make the implementation of new file metrics easier with a dedicated class that holds
        all the extensions.
    
        SystemIdentifier - Class that utilizes the System calls to identify what operating system the program is 
        currently running on. Class was created to ensure cross-platform compatibility and to be able to have control 
        of where the Git Repositories save on the machine.
    
    RepositoryAnalyzer package holds class files that utilize the Metrics package to perform metrics on the files 
    within a git repository. This package includes the following files:
    
        Analyzer - Processes the appropriate metrics for a file by invoking the metric objects in the Metrics package
        Result - Stores the metrics for the file as well as the filename.
    
    Metrics is a package enclosed with a Characters class, CommentLine class, Lines class, Words class, SourceLine 
    class and a MetricsException class. All methods are passed the file content as a String and the correct metric
    is returned to the method after calculation. 
    
    Back End to Front End
    There is only one class that is responsible for transferring data from the back-end to the front-end and 
    vice-versa. The two classes that help with the transfer are:
    
        Retrievable – interface class that allows the front end to invoke methods to obtain data stored in the back-end.
        DataProcessor – invoked by the front end to clone and analyze a git repository given a valid URL.
    
    

&nbsp;
***    
&nbsp;
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
    There is one user. A GUI application user.
    
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
    
    When a block comment is encountered in a given file, the commentLine class considers
    it as multiple lines of comments and not a single comment line.
    

&nbsp;
****
&nbsp;
<a name="detailreq"></a>
### 3. Detailed  Requirements         
<a name="extinterfacereq"></a>
##### 3.1 External Interface Requirements
    3.1.1 User Interfaces
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
        3.2.1 Mode 1 
        
        3.2.1.1 Functional Requirement 1.1 
             The system will take in a GitHub URL
             
        3.2.1.2 Functional Requirement 1.2
              The system will take in the file type
       
        3.2.1.3 Funcrional Requirement 1.3
             Calculate the chosen metric by the user
                 3.2.1.3a Will provide the Character Count of a file
                 3.2.1.3b Will provide the Word Count of a file
                 3.2.1.3c Will provide the Line Count of a file
                 3.2.1.3d Will provide the Comment Count of a file
                 3.2.1.3e Will provide the Source Line Count of a file
                 
        3.2.1.4 Functional Requirement 1.4 
              Display Filename and Chosen Metrics
              
        Use Case # 1: Cloning a Repository from GitHub
        
            Actor: User
            Participating Actor: Program
            Main Success Scenario:
                1.) User enters valid GitHub URL into appropriate field
                2.) User enters a file suffix to be searched for if desired
                3.) Appropriate Metrics are chosen by cheecking the given checkboxes
                4.) User Hits Enter key to submit URL and metric choices
                
            Main Failure Scenario:
                1.) User enters invalid GitHub URL
                2.) Error is thrown preventing them from moving forward
            
            
        Use Case # 2 : Displaying chosen Metrics 
        
            Actor: Program
            Pre-Condition: Valid GitHub URL and desired Metrics were chosen and accepted by program.
            Main Success Scenario:
                1.) 
            
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
