package gyakorlofajlbufferreaderskipmetodus;

import java.io.FileReader;
import java.io.BufferedReader;

public class GyakorloFajlBufferReaderSkipMetodus {


    public static void main(String args[]) {

        char[] array = new char[200];

        try {

            FileReader file = new FileReader("szoveg.txt");

            BufferedReader input = new BufferedReader(file);

            // Az első 20 karakter kihagyása
            input.skip(20);

            // Karakterek beolvasása
            input.read(array);

            System.out.println("A fájlból beolvasott szöveg, az első 20 karaktere nélkül > \n");
            System.out.println(array);

            // Még mindig le kell zárni!!!
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();

        }
    }
}