package week5.day34_abstraction.CarTask;

public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        if (year < 1886){
            System.err.println("Invalid year");
            System.exit(1);
        }
        this.make = getClass().getSimpleName();
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Price can not be 0 or negative!");
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop(){
        System.out.println("Pressing the break and stopping!");
    }

    protected abstract void start();

    @Override
    public String toString() {
        return "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
