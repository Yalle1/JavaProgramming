package week5.day30_Inheritence.PhoneTask;

public class Iphone extends Phone {

    public static boolean hasApplePay = true;

    public Iphone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNumber){

    }

    public void faceTime(String email){

    }
}
