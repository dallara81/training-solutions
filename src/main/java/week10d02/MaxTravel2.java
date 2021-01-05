package week10d02;
// második megoldás, órai magyarázat alapján

import java.util.List;

public class MaxTravel2{
    public static final int MAX_AMOUNT_OF_STOPS = 30;

    public static int getMaxIndex(List<Integer> stops){
        int[] possibleStops = new int[30];
        for (int i = 0; i < stops.size(); i++) {
            if (stops.get(i) > MAX_AMOUNT_OF_STOPS || stops.size() < 1 ){
                throw new IllegalArgumentException("A listával valami nincs rendben!");
            }
            possibleStops[stops.get(i)]++;
        }
        int biggestStop = 0;
        int biggestStopIndex = 0;

        for (int j = 0; j < possibleStops.length; j++) {
            if (possibleStops[j] > biggestStop){
                biggestStop = possibleStops[j];
                biggestStopIndex = j;
            }
        } return biggestStopIndex;
    }
}