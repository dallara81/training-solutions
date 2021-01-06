package exam02.cv;

public class Skill {

    private int level;
    private String name;

    public Skill(String name, int level) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + level + ")";
    }
}