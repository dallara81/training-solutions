package array;
// Tömbök - Keresés

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {
        for (int item : source) {
            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        final int[] testArray = new int[]{1, 2, 5, 8};
        // Display output
        System.out.println("--- Contains ---");
        System.out.println(" ");
        System.out.println("Contains 1?");
        System.out.println(arrayHandler.contains(testArray, 1));
        System.out.println(" ");
        System.out.println("Contains 8?");
        System.out.println(arrayHandler.contains(testArray, 8));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--- Find position ---");
        System.out.println(" ");
        System.out.println("Position of 1");
        System.out.println(arrayHandler.find(testArray, 1));
        System.out.println(" ");
        System.out.println("Position of 8");
        System.out.println(arrayHandler.find(testArray, 8));
    }
}