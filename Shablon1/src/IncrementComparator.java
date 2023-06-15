import java.util.Comparator;

public class IncrementComparator {
    public static void main(String... args){
        int a;
        Comparator incComp = new IntComparator();
        a = incComp.compare(-200,40);
        if(a>0) {
            System.out.println("Первое число больше");
        }
        else if(a<0)
        {
            System.out.println("Второе число больше");
        }
        else
        {
            System.out.println("Числа равны");
        }
    }
}
