package algorithm.sorting.bubble;

import algorithm.sorting.InsertionSort;
import org.junit.Test;

/**
 * @author Hyunjin Choi
 */
public class InsertionSortTest extends SortTest implements Sortable {

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
