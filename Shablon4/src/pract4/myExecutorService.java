package pract4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class myExecutorService
{
    private final ExecutorService exec;
    public myExecutorService(int threads)
    {
        if (threads == 1)
            exec = Executors.newSingleThreadExecutor();
        else
            exec = Executors.newFixedThreadPool(threads);
    }
    public synchronized void execute(Runnable command) {
        exec.execute(command);
    }
    public synchronized void shutdown() {
        exec.shutdown();
    }
}
