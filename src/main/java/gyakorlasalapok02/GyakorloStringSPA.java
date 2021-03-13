package gyakorlasalapok02;

public class GyakorloStringSPA {
    public static void main(String[] args) {
        String szojatekocska = cenzor("Béla fasz egy gyerek!","fasz","fasza");
        System.out.println("Lássuk a medvét!\n");
        System.out.println("Ez a helyzet: " + szojatekocska);
    }

    static String cenzor(String text, String toChange, String newWord){
        text = text.replaceAll(toChange, newWord);

        return text;
    }
}
