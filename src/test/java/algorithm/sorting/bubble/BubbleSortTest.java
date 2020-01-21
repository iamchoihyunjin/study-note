package algorithm.sorting.bubble;

import algorithm.sorting.BubbleSort;
import org.junit.Test;

/**
 * @author Hyunjin Choi
 */
public class BubbleSortTest extends SortTest implements Sortable {

    @Test
    @Override
    public void sortWithInteger() {
        super.sortWithInteger(new BubbleSort());
    }

    @Test
    @Override
    public void sortWithString() {
        super.sortWithString(new BubbleSort());
    }
}