package Metrics;
import com.sun.javafx.font.Metrics;

import java.io.*;

public class Characters {

    public int characterCount(String fileContent) throws MetricsException {
        try {
            int chars;
            if (fileContent.isEmpty()) throw new MetricsException();
            chars = fileContent.length();
            return chars + 1;
        } catch(MetricsException e) {

        }
    }

}