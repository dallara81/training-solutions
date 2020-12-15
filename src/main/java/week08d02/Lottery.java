package week08d02;
// Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy getNumbers() metódusa,
// ami visszaad egy listát amiben 5 véletlen szám van 1-90 között, tehát kvázi készíts egy lottósorsoló programot.
// A sorrendre nem kell figyelni, a lényeg, hogy a számok különbözők legyenek!

import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Lottery {
    private static final int NUM_NUMBERS = 5;
    private static final int NUM_BALLS = 90;
    private static final Random random = new Random();
    private final int[] numbers;

    private Lottery(final int[] numbers) {
        this.numbers = numbers;
    }

    public static Lottery draw() {
        final int[] numbers = new int[NUM_NUMBERS];
        final List<Integer> ballPool = IntStream.range(1, 1 + NUM_BALLS)
                .mapToObj(i -> i)
                .collect(Collectors.toList());
        for (int i = 0; i < NUM_NUMBERS; i++) {
            final int draw = random.nextInt(NUM_BALLS - i);
            numbers[i] = ballPool.remove(draw);
        }
        Arrays.sort(numbers);
        return new Lottery(numbers);
    }

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
            final StringBuilder sb = new StringBuilder("Szerencsétlenség ZRt. - 'ÚGYSEM NYERSZ SOHA' - Lottó\n");
        sb.append("----------------------------------------------------\nA kihúzott számok, sorrendben: ").append(Arrays.toString(numbers));
        sb.append("\n      Na látod, már megint nem nyertél! :D");
        return sb.toString();
    }

    public static void main(final String... args) {
        System.out.println(Lottery.draw());
    }
}
