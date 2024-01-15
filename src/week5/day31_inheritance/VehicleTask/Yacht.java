package week5.day31_inheritance.VehicleTask;

import java.time.LocalDate;

public class Yacht extends Boat{

    String name = "Johnson";
    public Yacht(String brand, String model, String color, LocalDate year, double price) {
        super(brand, model, color, year, price);
    }
}
