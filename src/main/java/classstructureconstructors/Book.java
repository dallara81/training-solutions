package classstructureconstructors;

public class Book {

    // Szerző
    private String author;

    // Cím
    private String title;

    // Regisztrációs szám
    private String regNumber;

    // Csak a szerzőt és a címet kell megadni!
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    //Core

        public String getAuthor() {
        return author;
        }

        public String getTitle() {
        return title;
        }

        public String getRegNumber() {
        return regNumber;
        }

        public void register(String regNumber) {
        this.regNumber = regNumber;
        }

}
