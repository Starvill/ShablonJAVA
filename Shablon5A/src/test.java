public class test {
    public static void main(String[] args)
    {
        DoubleCheckedLocking DoubleCheckedLocking1 = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking DoubleCheckedLocking2 = DoubleCheckedLocking.getInstance();
        System.out.println("DoubleCheckedLocking test");
        System.out.println("DoubleCheckedLocking test:" + DoubleCheckedLocking1.hashCode());
        System.out.println("DoubleCheckedLocking test:" + DoubleCheckedLocking2.hashCode());
        System.out.println("EnumSingleton test");

        EnumSingleton EnumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton EnumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("EnumSingleton test:" + EnumSingleton1.hashCode());
        System.out.println("EnumSingleton test:" + EnumSingleton2.hashCode());


        MySingleton MySingleton1 = MySingleton.getInstance();
        MySingleton MySingleton2 = MySingleton.getInstance();
        System.out.println("Lazy test");
        System.out.println("Lazy test:" + MySingleton1.hashCode());
        System.out.println("Lazy test:" + MySingleton2.hashCode());
    }
}
