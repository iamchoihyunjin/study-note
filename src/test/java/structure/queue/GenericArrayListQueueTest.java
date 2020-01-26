package structure.queue;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GenericArrayListQueueTest {

    @Test
    public void queueTest() {
        GenericArrayListQueue<Integer> genericArrayListQueue = new GenericArrayListQueue<>();

        assertThat(genericArrayListQueue.add(1)).isTrue();

        assertThat(genericArrayListQueue.peek()).isEqualTo(1);

        assertThat(genericArrayListQueue.poll()).isEqualTo(1);

        assertThat(genericArrayListQueue.peek()).isNull();

        assertThat(genericArrayListQueue.poll()).isNull();

    }
}