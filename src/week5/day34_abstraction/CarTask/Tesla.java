package week5.day34_abstraction.CarTask;

public class Tesla extends Car {
    public Tesla(String model, String color, int year, double price) {
        super( model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" is starting!");
    }

    public void autoPilot() {
        System.out.println(getClass().getSimpleName()+" is auto piloting!");
    }
}
