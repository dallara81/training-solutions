package classstructuremethods;


import java.util.Scanner;


public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Osztály-(h)arc v0.1 pre-alpha");
        System.out.println(" ");

        System.out.println("Felhasználó neve > ");
        String name = scanner.nextLine();
        note.setName(name);

        System.out.println("A jegyzet témája > ");
        String topic = scanner.nextLine();
        note.setTopic(topic);

        System.out.println("A jegyzet szövege > ");
        String text = scanner.nextLine();
        note.setText(text);

        System.out.println(note.getNoteText());
    }
}
