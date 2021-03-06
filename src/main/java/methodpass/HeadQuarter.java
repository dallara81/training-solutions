package methodpass;
// Értékmásolás szerinti paraméterátadás

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers;

    public HeadQuarter() {
        troopers = new ArrayList<>();
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("A katona nem lehet <null>!");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A név mező nem lehet üres, vagy <null>");
        }
        if (target == null) {
            throw new IllegalArgumentException("A cél nem lehet <null>");
        }
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("A cél nem lehet <null>");
        }

        moveTrooper(findClosestTrooper(target), target);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper:troopers) {
            if (name.equals(trooper.getName())) {
                return trooper;
            }
        }
        return null;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    private Trooper findClosestTrooper(Position target) {

        double distance = Double.MAX_VALUE;
        Trooper closestTrooper = null;
        for (Trooper trooper : troopers ) {
            if (trooper.distanceFrom(target) < distance) {
                closestTrooper = trooper;
                distance = trooper.distanceFrom(target);

            }
        }
        return closestTrooper;

    }
}