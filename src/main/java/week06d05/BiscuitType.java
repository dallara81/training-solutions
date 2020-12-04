package week06d05;

public enum BiscuitType {
    OREO("Oreo"), PILOTA("Pilóta"), MARABOU("Marabou"),
    ;

    private String name;

    BiscuitType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}