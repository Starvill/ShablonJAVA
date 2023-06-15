package FabricPad;

public class DX10010 implements Laptop{
    double price = 0;
    double diameter = 12;
    String name = "DX10010";
    double RAM = 16;

    public DX10010(int price)
    {
        this.price = price;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setPrice(int price)
    {
        this.price = price;
    }
    double getPrice(){
        return this.price;
    }

    void setDiameter(int diameter){
        this.diameter = diameter;
    }
    double getDiameter(){
        return this.diameter;
    }

    void setRAM(int RAM){
        this.RAM = RAM;
    }
    double getRAM(){
        return this.RAM;
    }

    public void print(){
        System.out.println("Имя:" + this.name);
        System.out.println("Цена:" + this.price);
        System.out.println("Оперативная память:" + this.RAM);
        System.out.println("Диаметр ноутбука:" + this.diameter);
    }
}
