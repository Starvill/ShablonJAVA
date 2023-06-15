import java.util.ArrayList;
import java.util.List;

public class myList<T> {
    private List<T> list;
    public myList() {
        list = new ArrayList<>();
    }
    synchronized  public void add(T elem) {
            list.add(elem);
    }
    synchronized  public void print() {
        System.out.println("myList " + list);
    }
}