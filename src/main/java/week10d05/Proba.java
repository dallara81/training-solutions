package week10d05;

public class Proba {

    public int findMinSum2(int[] arr) {
        int[] min = new int[4];
        for (int i = 0; i < Math.min(4, arr.length); ++i) {
            min[i] = arr[i];
        }
        for (int i = 4; i < arr.length; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (arr[i] < min[j]) {
                    min[j] = arr[i];
                    break;
                }
            }
        }
        return min[0]+min[1]+min[2]+min[3];
    }
}
