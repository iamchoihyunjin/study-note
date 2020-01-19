package algorithm.sorting.bubble;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortTest {

    @Test
    public void sortWithIntegerArray() {

        //given
        Integer[] integers = {3, 5, 1, 2, 7};

        //when
        Integer[] sortedResult = new BubbleSort().sort(integers);

        //then
        assertThat(sortedResult).containsExactly(1, 2, 3, 5, 7);

    }

    @Test
    public void sortWithAlphabetArray() {

        //given
        String[] strings = {"g", "a", "c", "d", "f"};

        //when
        String[] sortedResult = new BubbleSort().sort(strings);

        //then
        assertThat(sortedResult).containsExactly("a", "c", "d", "f", "g");

    }

}