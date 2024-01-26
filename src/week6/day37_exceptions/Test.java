package week6.day37_exceptions;

public class Test {

    public static void main(String[] args) {

        Pizza pizza = new Pizza('m',4,5);
        Pizza pizza2 = new Pizza('l',2,5);

        System.out.println("$"+pizza.calcCost());
        System.out.println("$"+pizza2.calcCost());

        boolean tof = pizza.equals(pizza2);

        System.out.println(tof);



    }
}
