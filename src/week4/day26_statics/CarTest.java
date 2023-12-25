package week4.day26_statics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car("Audi","A6","Nardo Grey",2016,30000);
        Car car2 = new Car("BMW","M4","Green",2018);
        Car car3 = new Car("Mercedes","A6","Blue");
        Car car4 = new Car("Toyota","Prius");
        Car car5 = new Car("Honda");

        ArrayList<Car> carGroup = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));

        for (Car car : carGroup) {
            System.out.println(car);
        }







    }
}
