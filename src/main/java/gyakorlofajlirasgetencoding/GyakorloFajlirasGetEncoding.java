package gyakorlofajlirasgetencoding;

import java.io.FileWriter;
import java.nio.charset.Charset;

public class GyakorloFajlirasGetEncoding {

    public static void main(String[] args) {

        String file = "rekordtabla2.txt";

        try {
            // default karakterráblával
            FileWriter output1 = new FileWriter(file);

            // specifikált karaktertáblával
            FileWriter output2 = new FileWriter(file, Charset.forName("UTF8"));

            // Kiíratás
            System.out.println("Karaktetábla (1.) > " + output1.getEncoding());
            System.out.println("Karaktetábla (2.) > " + output2.getEncoding());

            // Lezárás (kötelező)
            output1.close();
            output2.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}