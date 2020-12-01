package week06d02;

public class Product {

    private String category;
    private String name;
    private int price;

    public Product(String name, String category, int price) {

        this.category = category;
        this.name = name;
        this.price = price;

    }

    public String getCategory() {
        return category;

    }
}