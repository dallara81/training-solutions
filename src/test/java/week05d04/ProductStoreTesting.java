package week05d04;

public class ProductStoreTesting {

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    @Test
    public void ProductTest() {

        Product product = new Product("Vine",2020,11,25);
        assertEquals("Vine", product.getName());
        assertEquals("2020-11-25", product.getEndDate().toString());
        Store store = new Store();
        store.addProduct(product);
        store.addProduct(new Product("Apple",2020,11,30));
        store.addProduct(new Product("Milk",2020,12,12));
        store.addProduct(new Product("Pomegranate",2020,12,03));
        store.addProduct(new Product("Chocolate",2020,12,06));
        store.addProduct(new Product("Canned Stinky Beetle",2013,01,06));

        assertEquals(2, store.getNumberOfExpired());

        }
}
