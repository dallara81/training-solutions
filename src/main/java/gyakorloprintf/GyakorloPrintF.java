package gyakorloprintf;

import java.io.PrintWriter;

public class GyakorloPrintF {

    public static void main(String[] args) {

        try {
            PrintWriter output = new PrintWriter("rekordtabla4.txt");

            int darabszam = 24;

            output.printf("Sör > " + darabszam + " darab");
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}