package bubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void shouldSortedListOfInteger() {
        List<Comparable> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> result = bubbleSort.sort(input);
        Assertions.assertEquals(Arrays.asList(1, 3, 4, 5, 6, 8, 8), result);
    }

    @Test
    public void shouldSortedListOfDouble() {
        List<Comparable> input = Arrays.asList(-9.3, 0.2, 4, 0.1, 5, 9);
        List<Comparable> result = bubbleSort.sort(input);
        Assertions.assertEquals(Arrays.asList(-9.3, 0.1, 0.2, 4, 5, 9), result);
    }

    @Test
    public void shouldSortedListWithNull() {
        List<Comparable> input = Arrays.asList(null, 5.0001);
        List<Comparable> result = bubbleSort.sort(input);
        Assertions.assertEquals(Arrays.asList(5.0001), result);
    }

    @Test
    public void shouldThrowRunTimeExceptionWhenInputIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            bubbleSort.sort(null);
        });
    }
}