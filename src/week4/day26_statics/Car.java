package week4.day26_statics;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public Car(String make){
        this.make = make;
    }

    public Car(String make, String model){
        this(make);
        this.model = model;
    }
    public Car(String make, String model, String color){
        this(make, model);
        this.color = color;
    }
    public Car(String make, String model, String color, int year){
        this(make, model, color);
        this.year = year;
    }

    public Car(String make, String model, String color, int year, double price) {
        this(make, model, color, year);
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }
}
