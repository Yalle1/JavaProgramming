package week3.day18_garbageCollection;

public class TestPizzaClass {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza();

        pizza1.setInfo('M',5,2);

        System.out.println(pizza1);;

        System.out.println("---------------------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {
            Pizza small = new Pizza();
            small.setInfo('s',2,2);
            total += small.price();
            Pizza medium = new Pizza();
            medium.setInfo('m',3,4);
            total += medium.price();
            Pizza large = new Pizza();
            large.setInfo('l',4,5);
            total += large.price();
        }
        System.out.println("$"+total);



    }
}
