package week07d02;
// Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metódus,
// mely visszaadja a paraméterül kapott szám számjegyeinek összegét!

class SumOfDigits {

    public static void main(String args[]) throws Exception {

        int num = 123456789;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}


