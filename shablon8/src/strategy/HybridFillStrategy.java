package strategy;

public class HybridFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }
}

class F1PitstopStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Заправляем бензин только после всех остальных процедур пит-стопа!");
    }
}

class StandartFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Просто заправляем бензин!");
    }
}
