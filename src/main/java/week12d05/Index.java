package week12d05;

// Töltsd le az index.hu nyitólapját böngészőből, ez egy html állomány! Másold be a projektedbe (index.html) néven!
// Ez egy szöveges állomány. Olvasd be, és számold meg, hány sorban szerepel koronavírus szó!


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Index {

    public int getNumberOfWords() {
        int sum = 0;
        String word = "koronavírus";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                Index.class.getResourceAsStream("/index.html")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    sum+=1;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("A fájl nem olvasható!", ioe);
        }
        return sum;
    }
}