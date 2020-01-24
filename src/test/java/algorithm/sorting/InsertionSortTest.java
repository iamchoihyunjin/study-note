package algorithm.sorting;

import org.junit.Test;

/**
 * @author Hyunjin Choi
 */
public class InsertionSortTest extends SortTest implements SortTestable {

    @Test
    @Override
    public void sortWithInteger() {
        super.sortWithInteger(new InsertionSort());
    }

    @Test
    @Override
    public void sortWithString() {
        super.sortWithString(new InsertionSort());
    }
}
