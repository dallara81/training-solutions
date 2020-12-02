package gyakorlogetencoding;

import java.io.FileReader;
import java.nio.charset.Charset;

public class GyakorloGetEncoding {

    public static void main(String[] args) {

        try {

            FileReader input1 = new FileReader("szoveg.txt");

            FileReader input2 = new FileReader("szoveg.txt", Charset.forName("UTF8"));

            System.out.println("Karaktertábla (1.) > " + input1.getEncoding());
            System.out.println("Karaktertábla (2.) > " + input2.getEncoding());

            input1.close();
            input2.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
