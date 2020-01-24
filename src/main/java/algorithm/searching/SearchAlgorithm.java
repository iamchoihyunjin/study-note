package algorithm.searching;

/**
 * @author Hyunjin Choi
 */
public interface SearchAlgorithm {

    <T extends Comparable<T>> T find(T[] sortedArray, T key);
}
