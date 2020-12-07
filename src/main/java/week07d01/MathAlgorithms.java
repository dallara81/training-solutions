package week07d01;
// órai feladat

public class MathAlgorithms {

    public static boolean isPrime(int x) {

        if (x <= 0) {
            throw new IllegalArgumentException("A megadott számnak nagyobbnak kell lennie, mint nulla!");
        }
        if (x == 1) {
            return false;

        }
        for (int i = 2; i < Math.sqrt(x); i += 2) {
            if (x % i == 0) {
                return false;

            }
        }
        return true;

    }
}