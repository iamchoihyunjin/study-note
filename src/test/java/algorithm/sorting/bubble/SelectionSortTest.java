package algorithm.sorting.bubble;

import algorithm.sorting.SelectionSort;
import org.junit.Test;

public abstract class SelectionSortTest {

    @Test
    public void sortWithInteger() {
        SortTest.sortWithInteger(new SelectionSort());
    }

    @Test
    public void sortWithString() {
        SortTest.sortWithString(new SelectionSort());
    }
}
