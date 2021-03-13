package gyakorlasalapok05;

public class TernalisOperatorObject {

    public static void main(String[] args) {
        TernalisOperator first = new TernalisOperator();
        first.setName("Öcsi");
        first.setAge(32);

        String firstName = first.getName();

        // if (firstName == null) {
        //    System.out.println("Nincs név!");
        // }else{
        //    System.out.println("A név: " + firstName);
        // }

        // *** if / else helyett az alábbi ugyanaz: ***

        System.out.println( first.getName() == null ? "Nincs név!" : "A név: " + firstName);

    }
}
