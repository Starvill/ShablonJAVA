import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class mySet<T> {
    private Semaphore semaphore;
    private Set<T> set;
    public mySet()
    {
        semaphore = new Semaphore(1);
        set = new HashSet<>();
    }
    public void add(T elem) throws InterruptedException {
        semaphore.acquire();
        try {
            set.add(elem);
        }
        finally {
            semaphore.release();
        }
    }
    public void print()
    {
        System.out.print("mySet [");
        for (T bob : set)
        {
            System.out.print(" '" + bob + "'");
        }
        System.out.println("]");
    }
}
