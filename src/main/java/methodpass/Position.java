package methodpass;
// Értékmásolás szerinti paraméterátadás

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {

        this.posX = posX;
        this.posY = posY;

    }

    public double distanceFrom(Position position) {

        return Math.sqrt(Math.pow(posX - position.getPosX(), 2) + Math.pow(posY - position.getPosY(), 2));

    }

    public double getPosX() {

        return posX;

    }

    public double getPosY() {

        return posY;

    }
}