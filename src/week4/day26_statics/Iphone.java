package week4.day26_statics;

public class Iphone {

    public static String brand = "Apple"; // static: "Apple" is the brand of all Iphone objects
    public String model, color;   // instance: different models for iphone objects
    public double price;
    public static String OS = "IOS";

    public static boolean hasBattery = true;

    public static boolean hasTouchScreen = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
    }

    public static void printOperatingSystem(){
        System.out.println("OS = " + OS);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
