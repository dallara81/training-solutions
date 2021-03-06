package week06d05;

public class Biscuit {

    BiscuitType type;
    int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount) {
        return new Biscuit(type, gramAmount);
    }

    @Override
    public String toString() {
        return type.getName() + " - " + gramAmount + " gram";
    }

    public static void main(String[] args) {

        Biscuit biscuit = Biscuit.of(BiscuitType.OREO, 170);
        System.out.println(biscuit);
        System.out.println(Biscuit.of(BiscuitType.PILOTA, 230));
        System.out.println(Biscuit.of(BiscuitType.MARABOU, 400));
    }
}