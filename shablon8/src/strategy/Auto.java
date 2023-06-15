package strategy;

public class Auto {

    FillStrategy fillStrategy;

    public void fill() {
        fillStrategy.fill();
    }
    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }
}

class F1Car extends Auto {

    public F1Car() {
        this.fillStrategy = new F1PitstopStrategy();
    }
}

class HybridAuto extends Auto {

    public HybridAuto() {
        this.fillStrategy = new HybridFillStrategy();
    }
}

class Sedan extends Auto {

    public Sedan() {
        this.fillStrategy = new StandartFillStrategy();
    }
}
