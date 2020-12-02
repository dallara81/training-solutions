package gyakorlokaraktercserelo;

public class GyakorloKaraktercserelo {

    public static void main(String[] args) {

        String string = "Mi a siker lényege? A sikeres ember az, aki reggel felkel, lefekszik este, és a kettő között azt teszi, amit akar.";
        char ch = '-';

        string = string.replace(' ', ch);

        System.out.println("Így fest a String-ünk azután, hogy kicseréltünk a megadott karaktereket > ");
        System.out.println(string);

    }
}
