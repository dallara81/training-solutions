package arrays;
// Tömbök kezelése gyakorlófeladat

import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    // Hónapok napjainak száma tömb
    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }
    // Hét napjainak nevei tömb
    public List<String> daysOfWeek() {
        return Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
    }
    // Core
    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    private int min(int a, int b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);
        double[] rangeOfDay = Arrays.copyOfRange(day, 0, min);
        double[] rangeOfAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(rangeOfDay, rangeOfAnotherDay);
    }

    public boolean wonLottery(int[] winner, int[] stake) {
        int[] copyOfWinner = Arrays.copyOf(winner, winner.length);
        int[] copyOfStake = Arrays.copyOf(stake, stake.length);
        Arrays.sort(copyOfWinner);
        Arrays.sort(copyOfStake);
        return Arrays.equals(copyOfWinner, copyOfStake);
    }


    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println("---- Tömbök kezelése ----");
        System.out.println("A lecke gyakorlófeladatai");

        // Hónapok napjainak száma
        System.out.println(" ");
        System.out.println("A hónapok napjainak száma > ");
        System.out.println(arraysMain.numberOfDaysAsString());

        // Hét napjainak nevei
        System.out.println(" ");
        System.out.println("A hét napjainak nevei > ");
        System.out.println(arraysMain.daysOfWeek());

        // Szorzótábla
        System.out.println(" ");
        System.out.println("Szorzótábla > ");
        System.out.println(arraysMain.multiplicationTableAsString(4));

        // Hőmérsékleti értékek
        System.out.println(" ");
        System.out.println("Hőmérsékleti értékek >");
        System.out.println("Azonos mért értékeket tartalmaz-e?");
        System.out.println(arraysMain.sameTempValues(new double[] {1, 2, 3}, new double[] {1, 2, 3}));
        System.out.println(arraysMain.sameTempValues(new double[] {1, 2, 3}, new double[] {1, 2, 3}));

        System.out.println(" ");
        System.out.println("Lottó >");
        System.out.println(arraysMain.sameTempValuesDaylight(new double[] {1, 2}, new double[] {1, 2, 3}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[] {1, 3}, new double[] {1, 2, 3}));

        int[] winner = new int[]{1, 12, 55, 24, 90};
        int[] stake = new int[]{24, 12, 1, 24, 55};

        System.out.println(arraysMain.wonLottery(winner, stake));
        System.out.println(Arrays.toString(stake));

        System.out.println(arraysMain.wonLottery(new int[]{1, 12, 24}, new int[]{1, 12, 12}));

    }
}