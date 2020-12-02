package gyakorlobufferedread;

import java.io.FileReader;
import java.io.BufferedReader;

public class GyakorloBufferedRead {

    public static void main(String[] args) {

        // Vegyük a szöveg első 200 karakterét
        char[] array = new char[200];

        try {
            // FileReader
            FileReader file = new FileReader("szoveg.txt");

            // BufferedReader
            BufferedReader input = new BufferedReader(file);

            // Karakterek beolvasása
            input.read(array);
            System.out.println("A fájlból beolvasott karakterek > ");
            System.out.println(array);

            // Le kell zázni!!!
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}