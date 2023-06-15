public class main
{
    public static void main(String[] args) throws Exception{
        mySet<String> set = new mySet<>();
        Thread one = new Thread(()->{
            try {
                set.add("bob1");
                set.add("bob2");
                set.add("bob3");
                set.print();
            }catch (InterruptedException e)
            {
                System.out.println("Поток был прерван");
            }
        });
        myList<String> list = new myList<>();
        Thread two = new Thread(()->{
            list.add("bob4");
            list.add("bob5");
            list.add("bob6");
        });
        Thread three = new Thread(()->{
            list.add("bob7");
            list.add("bob8");
            list.add("bob9");
            list.print();
        });
        one.start();
        one.join();
        two.start();
        three.start();
    }
}