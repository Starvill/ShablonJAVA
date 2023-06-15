package FabricPad;

public class publicUserClient {
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();
        Laptop laptop = laptopFactory.createLaptop("DX20168");
        laptop.print();
    }
}

