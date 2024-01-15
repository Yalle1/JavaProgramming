package week5.day32_finalKeyword.CarTask;

public class BMW extends Car{


    public BMW(String model, String color, double price, int year) {
        super(model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanics or jump start");
    }
}
