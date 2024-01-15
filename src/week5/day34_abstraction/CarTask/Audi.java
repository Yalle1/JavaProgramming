package week5.day34_abstraction.CarTask;

public class Audi extends Car {
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" is starting!");
    }

    public void autoPark(){
        System.out.println(getClass().getSimpleName()+" is auto parking!");
    }
}
