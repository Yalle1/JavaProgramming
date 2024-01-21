package week5.day30_Inheritence.PhoneTask;

import java.util.Arrays;

public class Phone {

    private String brand, model, size, color;
    private double price;

    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // if (color.equalsIgnoreCase("black") || color.equalsIgnoreCase("white") || color.equalsIgnoreCase("silver") || color.equalsIgnoreCase("gold") || color.equalsIgnoreCase("pink")) {
           String[] colors = {"Black","White","Silver","Gold","Pink","Blue","Gray"};
           if (Arrays.asList(colors).contains(color)){
            this.color = color;
        } else {
            System.err.println("Color not available: " + color);
            System.exit(1);
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid Price: " + price);
            System.exit(1);
        }
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
