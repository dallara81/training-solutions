package classstructureintegrate;

public class Product {

    // Név (string)
    private String name;

    // Ár (integer)
    private int price;

    // Termék (string & integer)
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Név def.
    public String getName() {
        return name;
    }

    // Ár def.
    public int getPrice() {
        return price;
    }

    // Ár növelése rutin
    public void increasePrice(int amount) {
        price = price + amount;
    }

    // Ár csökkentése rutin
    public void decreasePrice(int amount) {
        price = price - amount;
    }

}
