package week5.day34_abstraction.CarTask;

public class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" is starting!");
    }
}
