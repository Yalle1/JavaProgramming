package week4.day26_statics;

public class TestIphoneObjects {

    public static void main(String[] args) {

        Iphone phone1 = new Iphone("Iphone 12","White",1000);

        // Below we are using instance variables

        System.out.println(phone1.model);
        System.out.println(phone1.color);
        System.out.println("$"+phone1.price);

        System.out.println("---------------------------");

        // Below we are using static variables

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        System.out.println(Iphone.hasBattery);



    }
}
