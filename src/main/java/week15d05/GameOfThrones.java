package week15d05;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.IOException;

public class GameOfThrones{


    public Map.Entry<String, Integer> getHouseWithMostBattles(String file) {
        Map<String, Integer> battleMap = createBattleMap(file);
        Map.Entry<String, Integer> houseWithMostBattles = null;
        for (Map.Entry<String, Integer> entry : battleMap.entrySet()) {
            if (entry.getKey().trim().equals("")) {
            } else if (houseWithMostBattles == null) {
                houseWithMostBattles = entry;
            } else {
                if (entry.getValue() > houseWithMostBattles.getValue()) {
                    houseWithMostBattles = entry;

                }
            }

        }
        return houseWithMostBattles;
    }

    private Map<String, Integer> createBattleMap(String file) {
        Map<String, Integer> battleMap = new TreeMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            String line;
            readHeader(reader);
            while ((line = reader.readLine()) != null) {
                List<String> attackers = getSubList(line, 5, 8);
                putNewEntry(battleMap, attackers);
                List<String> defenders = getSubList(line, 9, 12);
                putNewEntry(battleMap, defenders);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file, ioe");
        }

        System.out.println(battleMap);
        return battleMap;

    }

    private void putNewEntry(Map<String, Integer> battleMap, List<String> fighters) {
        for (String fighter : fighters) {
            if (!battleMap.containsKey(fighter)) {
                battleMap.put(fighter, 0);
            }
            battleMap.put(fighter, battleMap.get(fighter) + 1);
        }
    }

    private List<String> getSubList(String line, int firstIndex, int lastIndex) {
        List<String> subList = Arrays.asList(line.split(",")).subList(firstIndex, lastIndex);
        return subList;
    }

    private void readHeader(BufferedReader reader) throws IOException {
        reader.readLine();
    }
}