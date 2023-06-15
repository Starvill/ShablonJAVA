import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {

    @FunctionalInterface
    public interface Comparator<T> {
        int compare(T a, T b);
    }
    @Override
    public int compare(Integer a, Integer b) {
        return Math.abs(a) - Math.abs(b);
    }
}
