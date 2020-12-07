package methoverloading;
// Java SE alapok - Java OO elemek >
// Attribútumok és metódusok > Metódusnév túlterhelés

public class Pub {

    private Time openFrom;
    private String name;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.openFrom = new Time(hours, minutes);
    }

    public String getName() {
        return name;
    }

    public Time getOpenFrom() {
        return openFrom;
    }

    public String toString() {
        return name + ";" + openFrom.getHours() + ":" + openFrom.getMinutes();
    }
}