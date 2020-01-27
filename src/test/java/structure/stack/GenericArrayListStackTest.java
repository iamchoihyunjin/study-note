package structure.stack;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericArrayListStackTest {

    @Test
    public void stackTest() {
        GenericArrayListStack genericArrayListStack = new GenericArrayListStack();

        genericArrayListStack.push("Hello");
        genericArrayListStack.push("Hi");
        genericArrayListStack.push("World");

        assertThat(genericArrayListStack.peek()).isEqualTo("World");

        assertThat(genericArrayListStack.pop()).isEqualTo("World");
        assertThat(genericArrayListStack.pop()).isEqualTo("Hi");
        assertThat(genericArrayListStack.pop()).isEqualTo("Hello");
        assertThat(genericArrayListStack.pop()).isNull();
    }
}
