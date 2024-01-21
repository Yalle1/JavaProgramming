package week6.day36_polymorphism.IphoneTask;

public class TestIphoneObject {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("X","Black");
        Iphone iphone2 = new Iphone("X","Black");

        System.out.println(iphone2.equals(iphone1));


        System.out.println(iphone1);
        System.out.println(iphone2);


    }
}
