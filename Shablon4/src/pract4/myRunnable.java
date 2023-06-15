package pract4;

public class myRunnable implements Runnable
{
    private final int number;

    myRunnable(int number) {
        this.number = number;
    }
    public synchronized void run() {
        System.out.println("Id потока " + Thread.currentThread().getId() + ", Выполнена задача "+ number);
    }
}
