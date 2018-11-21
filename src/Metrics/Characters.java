package Metrics;
import java.io.*;

public class Characters {

    public void fileRead(String filename) {
        try {

            FileReader file = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(file);
            StringBuilder response = new StringBuilder();
            String filecontent;
            int c;

            while ((c = BufferedReader.read()) != -1) {
                // Since c is an integer, cast it to a char.
                // If c isn't -1, it will be in the correct range of char.
                response.append((char) c);
            }
            filecontent = response.toString();
            buffer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public void characterCount(String filecontent) {
        int chars;
        chars = filecontent.length();
    }

    
}