package week09d02;
// A week09d02 csomagban készíts egy osztályt FibCalculator néven.
// Ennek legyen egy metódusa long sumEvens(int bound) néven.
// Ennek a metódusnak a feladata az, hogy összeadja a páros fibonacci számokat addig,
// amig a következő fibonacci szám nem nagyobb, mint bound, majd visszadja a végredményt.

public class FibCalculator {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 30; i++) {
            if (sumEvens(i) % 2 == 0) {
                System.out.println(sumEvens(i));
                sum += sumEvens(i);
            }
        }

        System.out.println("A páros fibonacci számok összege: " + sum);
    }

    public static long sumEvens(int bound) {
        if (bound <= 1) {
            return bound;
        } else {
            return sumEvens(bound-1) + sumEvens(bound-2);
        }
    }
}