import java.util.Date;

public class P{
    int age;
    int birthDate;
    String  fio;
    int weight;
    public P(String f, int d, int weight){
        Date dt=new Date();
        this.age = dt.getYear() + 1900 - d;

        this.birthDate = d;
        this.fio = f;
        this.weight = weight;
    }
    public String toFio(){
        return this.fio;
    }
    public void printFio(){
        System.out.println(this.fio);
    }
}
