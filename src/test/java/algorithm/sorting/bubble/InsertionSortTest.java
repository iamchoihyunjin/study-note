package algorithm.sorting.bubble;

import algorithm.sorting.InsertionSort;

/**
 * @author Hyunjin Choi
 */
public class InsertionSortTest extends SortTest implements Sortable {

    @Override
    public void sortWithInteger() {
        super.sortWithInteger(new InsertionSort());
    }

    @Override
    public void sortWithString() {
        super.sortWithString(new InsertionSort());
    }
}
