package gyakorlofajliras;

import java.io.FileWriter;

public class GyakorloFajliras {

    public static void main(String args[]) {

        String data = "Pech-Man Géza" + " 512 pont";

        try {
                // FileWriter fájl létrehozása
            FileWriter output = new FileWriter("rekordtabla.txt");

                // A String beírása a Fájlba
            output.write(data);

                // FileWriter lezárása
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}