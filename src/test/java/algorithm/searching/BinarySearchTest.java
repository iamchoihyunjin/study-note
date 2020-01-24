package algorithm.searching;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {

    @Test
    public void find() {
        assertThat(new BinarySearch().find(new Integer[]{1, 2, 3, 4, 5, 7, 8, 9, 10}, 9)).isEqualTo(9);
    }

}
