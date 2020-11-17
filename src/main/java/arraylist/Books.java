package arraylist;
// Könyvek

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public void removeByPrefix(String prefix) {
        List<String> toDelete = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                toDelete.add(title);
            }
        }
        titles.removeAll(toDelete);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> found = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Az IQ és az emberi intelligencia");
        books.add("A transzgenerációs trauma és terápiája");
        books.add("A pszichiátria magyar kézikönyve");
        books.add("Pszichológiai gyakorlatok 1.");

        System.out.println("--- Books ---");
        System.out.println(" ");
        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("Pszi"));

        System.out.println(" ");
        System.out.println("<Pszi> kezdetű könyvcímek eltávolítása >");
        books.removeByPrefix("Pszi");
        System.out.println(books.getTitles());

    }

}