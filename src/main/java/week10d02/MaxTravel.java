package week10d02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MaxTravel {

    public int getMaxIndex(List<Integer> stations) {
        if (stations == null || stations.size() < 1) {
            throw new IllegalArgumentException("Heh, lista? B*szod!");
        }
        List<Integer> sortStations = new ArrayList<>(stations);
        Collections.sort(sortStations);
        int maxstationNumber = sortStations.get(0);
        int maxStart = 0;
        for (int i = 0; i < 30; i++) {
            int max = 0;
            for (Integer station : stations) {
                if (station == i) {
                    max++;
                    if (max > maxStart) {
                        maxStart = max;
                        maxstationNumber = i;
                    }
                }
            }
        }
        return maxstationNumber;
    }
}