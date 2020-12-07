package methodpass;
// Értékmásolás szerinti paraméterátadás

public class Trooper {


    private String name;
    private Position position = new Position(0, 0);

    public Trooper(String name) {

        if (name == null || name.isBlank()) {

            throw new IllegalArgumentException("A név mező nem lehet üres!");

        }
        this.name = name;
    }

    public void changePosition(Position target) {
        if (target == null) {

            throw new IllegalArgumentException("A cél nem lehet null! Elég nagy butaság lenne magadat lőni :D");

        }
        position = target;
    }

    public double distanceFrom(Position target) {
        if (target == null) {

            throw new IllegalArgumentException("A távolság nem lehet null! Magadat akarod megcélozni? Gratula!");

        }
        return position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}