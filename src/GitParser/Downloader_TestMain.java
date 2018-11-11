package GitParser;

import java.io.File;

public class Downloader_TestMain
{
    public static void main(String[] args)
    {
        String link = "https://pdfs.semanticscholar.org/efb2/58d7812128aa19709520b1a567da98227cc5.pdf"; //TEST: "A Concise Introduction to Software Engineering" PDF file
        //File out = new File("home/filipinoy95/Desktop/Test.pdf");

        /* TODO: Windows Users - Please specify the path AND name of the pdf file you would like to use
        *  For instance, Zoran David's file will be downloaded here:
        *  File out = new File("C:\\Users\\Zoran David\\Desktop\\Java The Complete.pdf");
        * */
        File out = new File(" "); //TODO: type in path name here


        new Thread(new Downloader(link, out)).start();
    }
}
