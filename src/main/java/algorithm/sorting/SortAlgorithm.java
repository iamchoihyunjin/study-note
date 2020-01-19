package algorithm.sorting;

/**
 * @author Hyunjin Choi
 */
public interface SortAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] unsorted);
}
