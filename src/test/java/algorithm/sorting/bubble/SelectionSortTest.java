package algorithm.sorting.bubble;

import algorithm.sorting.selection.SelectionSort;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void sortWithInteger() {
        SortTest.sortWithInteger(new SelectionSort());
    }

    @Test
    public void sortWithString() {
        SortTest.sortWithString(new SelectionSort());
    }
}
