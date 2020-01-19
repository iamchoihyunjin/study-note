package algorithm.sorting.bubble;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortWithIntegerArray() {
        SortTest.sortWithInteger(new BubbleSort());
    }

    @Test
    public void sortWithAlphabetArray() {
        SortTest.sortWithString(new BubbleSort());
    }

}