package algorithm.sorting.bubble;

import algorithm.SortAlgorithm;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

abstract class SortTest {

    static void sortWithInteger(SortAlgorithm sortAlgorithm) {

        //given
        Integer[] integers = {9, 8, 7, 6, 5};

        //when
        Integer[] sortedResult = sortAlgorithm.sort(integers);

        //then
        System.out.println(Arrays.toString(sortedResult));
        assertThat(sortedResult).containsExactly(5, 6, 7, 8, 9);

    }

    static void sortWithString(SortAlgorithm sortAlgorithm) {

        //given
        String[] strings = {"g", "a", "c", "d", "f"};

        //when
        String[] sortedResult = sortAlgorithm.sort(strings);

        //then
        System.out.println(Arrays.toString(sortedResult));
        assertThat(sortedResult).containsExactly("a", "c", "d", "f", "g");

    }
}
