package week5.day32_finalKeyword.CarTask;

public class Car {

    private String make, model, color;
    private double price;
    private int year;

    private static int numberOfWheels;
    private static boolean hasBattery;

    public Car(String model, String color, double price, int year) {
        setMake(getClass().getSimpleName());
        setModel(model);
        setColor(color);
        setPrice(price);
        setYear(year);
    }

    static {
        numberOfWheels = 4;
        hasBattery = true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Price can not be negative or zero!");
            System.exit(1);
        }
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0){
            System.err.println("Year can not be negative or zero!");
            System.exit(1);
        }
        this.year = year;
    }

    public static int getNumberOfWheels() {
        return numberOfWheels;
    }

    public static void setNumberOfWheels(int numberOfWheels) {
        Car.numberOfWheels = numberOfWheels;
    }

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static void setHasBattery(boolean hasBattery) {
        Car.hasBattery = hasBattery;
    }

    public void start(){
        System.out.println("Press the break amd twist the key to ignition");
    }



    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                ", year=" + year +
                '}';
    }
}
