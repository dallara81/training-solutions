package gyakorlostringiro;

import java.io.StringWriter;

public class GyakorloStringIro {

    public static void main(String[] args) {

        String data = "Minden az elméden múlik. Ha nem hiszed el, hogy képes vagy valamire, akkor nem is leszel képes rá.";

        try {
            // Egy StringWriter létrehozása, alapértelmezett buffer kapacitással
            StringWriter output = new StringWriter();

            // Adatok beírása a String Buffer-be
            output.write(data);

            System.out.println("StringWriter gyakorlóprogram\n");

            // Kiíratás
            System.out.println("A StringWriter tartalma: " + output);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}