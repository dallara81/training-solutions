package classstructureconstructors;

public class BookMain {

        public static void main(String[] args) {

        // header
        System.out.println("KOT - Könyv-Osztály-Találkozó v0.1");
        System.out.println(" ");

        // data
        Book book = new Book("Charles D. Brown", "Elements of Spacecraft Design");
        book.register("0000471209");

        // core
        System.out.println("Könyv szerzője > " + book.getAuthor());
        System.out.println("Könyv címe > " + book.getTitle());
        System.out.println("Könyv regisztrációs száma >" + book.getRegNumber());
    }

}
