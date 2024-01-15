package week5.day32_finalKeyword.CarTask;

import java.util.Arrays;

public class Tesla extends Car {


    public Tesla(String model, String color, double price, int year) {
        super(model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\"");
    }

    @Override
    public void setModel(String model) {

        String[] models = {"model s", "model y","model x","model 3"};

        model = model.toLowerCase();

        if (!Arrays.asList(models).contains(model)){
            System.err.println("Model not available/Invalid!");
            System.exit(1);
        }
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        if (!(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("white") || color.equalsIgnoreCase("black") || color.equalsIgnoreCase("silver") || color.equalsIgnoreCase("blue")|| color.equalsIgnoreCase("brown")|| color.equalsIgnoreCase("green"))){
            System.err.println("Invalid Color!");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setPrice(double price) {
        if (price< 50000){
            System.err.println("Come on man, no Tesla costs less than 50k (xD)");
            System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void setYear(int year) {
        if (year < 2008){
            System.err.println("Year can not be pre 2008");
            System.exit(1);
        }
        super.setYear(year);
    }
}
