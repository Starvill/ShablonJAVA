package pract4;

public class Test
{
    public static void main(String[] args) {
        myExecutorService executor = new myExecutorService(4);
        for (int i = 0; i < 10; i++) {
            executor.execute(new myRunnable(i));
        }
        executor.shutdown();
    }
}
