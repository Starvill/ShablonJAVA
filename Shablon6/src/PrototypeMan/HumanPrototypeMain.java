package PrototypeMan;

public class HumanPrototypeMain extends Human {

    public static void main(String[] args) {
        Human human1 = new Human("Григорий", "Рублев", 19);

        Human human2 = (Human) human1.getClone();
    }
}
