package algorithm.sorting.bubble;

import algorithm.SortAlgorithm;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {

    @Test
    public static void sortWithInteger(SortAlgorithm sortAlgorithm) {

        //given
        Integer[] integers = {3, 5, 1, 2, 7};

        //when
        Integer[] sortedResult = sortAlgorithm.sort(integers);

        //then
        assertThat(sortedResult).containsExactly(1, 2, 3, 5, 7);

    }

    @Test
    public static void sortWithString(SortAlgorithm sortAlgorithm) {

        //given
        String[] strings = {"g", "a", "c", "d", "f"};

        //when
        String[] sortedResult = new BubbleSort().sort(strings);

        //then
        assertThat(sortedResult).containsExactly("a", "c", "d", "f", "g");

    }
}
