package algorithm.searching;

public class NotFoundException extends RuntimeException {
    public <T extends Comparable<T>> NotFoundException(T key) {
        super("Not Found Key : " + key);
    }
}
