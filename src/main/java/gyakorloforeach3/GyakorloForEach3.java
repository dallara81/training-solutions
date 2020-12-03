package gyakorloforeach3;
// Listával

import java.util.List;
import java.util.ArrayList;

public class GyakorloForEach3 {

    public static void main(String[] args) {

        List<String> autok = new ArrayList<String>();
        autok.add("Ford");
        autok.add("Audi");
        autok.add("VW");
        autok.add("Seat");
        autok.add("Fiat");
        autok.add("Opel");
        autok.add("Mercedes");
        autok.add("Porsche");
        autok.add("BMW");
        autok.add("Volvo");

        //lambda expression forEach metódus
        autok.forEach(str->System.out.println(str));

    }
}