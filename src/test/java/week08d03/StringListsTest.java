package week08d03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class StringListsTest {

    @Test
    public void testUnio() {
        List<String> first = Arrays.asList("a", "b", "c");
        List<String> result = Arrays.asList("a", "b", "c", "d");
        List<String> second = Arrays.asList("a", "c");
        List<String> second = Arrays.asList("a", "d");

        Assertions.assertEquals(result, new StringLists().stringListsUnion(first, second));
    }
}