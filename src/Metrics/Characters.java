package Metrics;
import java.io.*;

public class Characters {

String filename;
int chars;
int charTotal;

    public void charaCount() {
        try {
            FileReader file = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(file);

            while (buffer.read() != -1) {
                chars++;
            }
            charTotal+=chars;
            buffer.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file");
        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

}
