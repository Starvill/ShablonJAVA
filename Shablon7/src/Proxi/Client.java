package Proxi;

public class Client {
    public static void main(String[] args) {
        RealObjectProxy proxy = new RealObjectProxy();
        proxy.doSomething1(1);
    }
}
