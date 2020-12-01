package week06d02;
// Tesztek (rövidítve)

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {

    private List<Product> productList;
    private Store store;

    @BeforeEach
    public void setUp() {
        productList = new ArrayList<>();
        store = new Store(productList);
        productList.add(new Product("kifli", "bakedgoods", 25));
        productList.add(new Product("rejtvényújság", "other", 299));
        productList.add(new Product("napilap", "other", 199));
        productList.add(new Product("napszemüveg", "other", 1990));
        productList.add(new Product("számológép", "other", 2990));
        productList.add(new Product("sajtospogácsa", "bakedgoods", 129));
        productList.add(new Product("túró", "dairy", 299));
        productList.add(new Product("sertéskaraj", "dairy", 1290));
        productList.add(new Product("tepertőspogácsa", "bakedgoods", 159));
        productList.add(new Product("joghurt", "dairy", 169));
        productList.add(new Product("tej", "dairy", 169));
        productList.add(new Product("ütvefúrógép", "other", 39900));
    }

    @Test
    public void testStore() {
        Assertions.assertEquals(3, store.getProductByCategoryName("dairy"));

    }
}