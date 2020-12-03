package week06d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BudgetTest {

    private List<Item> itemList;
    private Budget budget;

    @BeforeEach
    public void setUp() {
        budget = new Budget(itemList);

        Item item1 = new Item(30000, 2, "gáz");
        Item item2 = new Item(20000, 2, "villany");
        Item item3 = new Item(250000, 3, "élelmiszer");
        Item item4 = new Item(200000, 8, "műszaki cikk");
        Item item5 = new Item(100000, 8, "közlekedés");
        Item item6 = new Item(100000, 2, "egyéb");
        Item item7 = new Item(400000, 1, "tartalékképzés");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
    }

    @Test
    public void testBudget() {
        Assertions.assertEquals(30000, budget.getItemsByMonth(2));
    }
}