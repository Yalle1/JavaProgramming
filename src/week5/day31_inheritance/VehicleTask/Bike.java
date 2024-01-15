package week5.day31_inheritance.VehicleTask;

import java.time.LocalDate;

public class Bike extends Vehicle {
    public Bike(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride(){
        System.out.println("Now riding bike");
    }

}
