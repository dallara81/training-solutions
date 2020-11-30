package gyakorloarray01;

public class GyakorloArray01 {

    public static void main(String[] args) {

        System.out.println("Deklaráljunk tömböket! Tömbök nélkül nincs élet.");

        // Dejkaráljunk egy i int-t
        int i;

        // Deklaráljunk egy tömböt!
        int arr_lit[] = new int[] {
                11,
                222,
                444,
                543
        };

        // Deklaráljunk tömb objektumot!
        int arr_obj[] = new int[8];
        //Using for loop to access elements in arr_obj
        for (i = 0; i < 8; i++) {
            arr_obj[i] = i;
        }

        // minden loop-nál használjuk az arr_lit-en keresztüli iterációt
        System.out.println("A literál tömbnek vannak elemei:");
        for (int j: arr_lit) {
            System.out.print(j + " ");
        }
        System.out.println("");

        System.out.println("A tömb objektumnak vannak értéjei:");
        for (i = 0; i < 8; i++) {
            System.out.print(arr_obj[i] + " ");
        }
    }
}