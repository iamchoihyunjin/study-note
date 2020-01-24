package algorithm.sorting;

import algorithm.sorting.SortAlgorithm;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Hyunjin Choi
 */
abstract class SortTest {

    void sortWithInteger(SortAlgorithm sortAlgorithm) {

        //given
        Integer[] integers = {9, 6, 8, 7, 5};

        //when
        Integer[] sortedResult = sortAlgorithm.sort(integers);

        //then
        assertThat(sortedResult).containsExactly(5, 6, 7, 8, 9);
    }

    void sortWithString(SortAlgorithm sortAlgorithm) {

        //given
        String[] strings = {"g", "a", "c", "d", "f"};

        //when
        String[] sortedResult = sortAlgorithm.sort(strings);

        //then
        assertThat(sortedResult).containsExactly("a", "c", "d", "f", "g");
    }
}
