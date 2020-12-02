package gyakorloprintwriter;

import java.io.PrintWriter;

public class GyakorloPrintWriter {

    public static void main(String[] args) {

        String data = "Nincs lehetetlen, csak tehetetlen ember.";

        try {
            PrintWriter output = new PrintWriter("rekordtabla3.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}