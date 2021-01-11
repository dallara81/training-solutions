package week11d01;

// Készítsünk egy DivisorFinder nevű osztályt, melynek van egy int findDivisors(int n) metódusa.
// A feladat az, hogy megnézzük a szám minden egyes számjegyére, hogy osztója-e a számnak,
// majd számoljuk össze őket. Példa: a 425-ben az 5 osztója a számnak, ezért a visszatérési érték 1.

public class DivisorFinder {

    public int findDivisors(int n) {
        String sn = "" + n;
        int x;
        int counter = 0;
        for (int i = 0; i < sn.length(); i++) {
            x = Integer.parseInt(sn.substring(i, i + 1));
            if (x > 0) {
                if (n % x == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // Csak azért is main-ben! - mert a main nem Maine

    public static void main(String[] args) {
        DivisorFinder divisorFinder = new DivisorFinder();
        System.out.println(divisorFinder.findDivisors(425));

    }
}