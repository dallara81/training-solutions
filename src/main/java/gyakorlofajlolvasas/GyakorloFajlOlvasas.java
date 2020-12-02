package gyakorlofajlolvasas;

import java.io.FileReader;

public class GyakorloFajlOlvasas {

    public static void main(String[] args) {

        char[] array = new char[100];

        try {

            FileReader input = new FileReader("szoveg.txt");

            input.read(array);
            System.out.println("Beolvasás eredménye > ");
            System.out.println(array);

            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
