package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        StringBuilder stars = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                int numberOfStarsPerLine = Integer.parseInt(line);
                stars.append("*".repeat(numberOfStarsPerLine));
                stars.append('\n');
            }
        } catch (IOException ioe) {
            throw new IllegalStateException(" Bobo, seriously... where is the file? I can't read this. ", ioe);
        }
        return stars.toString();
    }
}