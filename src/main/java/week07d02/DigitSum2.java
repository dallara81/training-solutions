package week07d02;
// Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metódus,
// mely visszaadja a paraméterül kapott szám számjegyeinek összegét!

class DigitSum2 {

    int sumOfDigits(int x) {

        String szamjegyek = Integer.toString(x);
        int sum = 0;

        for (int i = 0; i < szamjegyek.length(); i++) {
            sum += (Integer.parseInt(szamjegyek.substring(i, i + 1)));
        }
        return sum;
    }
}