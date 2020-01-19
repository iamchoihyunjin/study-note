package algorithm.sorting.selection;

import algorithm.SortAlgorithm;

public class SelectionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsorted) {
        int min;

        for (int i = 0; i < unsorted.length - 1; i++) {
            min = i;

            for (int j = i; j < unsorted.length; j++) {
                if (unsorted[j].compareTo(unsorted[min]) < 0)
                    min = j;
            }

            if (min != i) {
                T temp = unsorted[i];
                unsorted[i] = unsorted[min];
                unsorted[min] = temp;
            }
        }
        return unsorted;
    }
}
