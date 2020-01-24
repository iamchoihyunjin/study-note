package algorithm.sorting;

import org.junit.Test;

/**
 * @author Hyunjin Choi
 */
public class SelectionSortTest extends SortTest implements SortTestable {

    @Test
    @Override
    public void sortWithInteger() {
        super.sortWithInteger(new SelectionSort());
    }

    @Test
    @Override
    public void sortWithString() {
        super.sortWithString(new SelectionSort());
    }
}
