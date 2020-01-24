package algorithm.searching;

/**
 * @author Hyunjin Choi
 */
class NotFoundException extends RuntimeException {
    <T extends Comparable<T>> NotFoundException(T key) {
        super("Not Found Key : " + key);
    }
}
