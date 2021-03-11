package gyakorlohash1;

// a HashSet osztály beimportálása
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("SAAB");
        cars.add("Volvo");
        cars.add("VW");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Opel");
        cars.add("Porsche");
        cars.add("Mercedes");
        cars.add("Citroen");
        cars.add("Renault");
        cars.add("Peugeor");
        System.out.println(cars);
    }
}
