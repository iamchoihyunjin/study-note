package algorithm.sorting.bubble;

import algorithm.SortAlgorithm;

public class BubbleSort implements SortAlgorithm {

    /**
     * return -1 when comparator less than.
     * return 0 when comparator equal.
     * return 1 when comparator higher than.
     */

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
