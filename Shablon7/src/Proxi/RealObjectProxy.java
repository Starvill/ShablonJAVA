package Proxi;

public class RealObjectProxy extends RealObjectImpl {
    public void doSomething1(int i) {
        if (i<=1)
        {
            System.out.println("Делегирование прав реальному объекту");
            super.doSomething();
        }
        else{
            System.out.println("У вас недостаточно прав");
        }
    }
}
