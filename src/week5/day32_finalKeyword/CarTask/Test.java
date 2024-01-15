package week5.day32_finalKeyword.CarTask;

public class Test {


    public static void main(String[] args) {

        Audi audi = new Audi("RS6","Blue",50000,2015);
        Tesla tesla = new Tesla("Model X","Blue",200000,2015);

        System.out.println(audi);
        System.out.println(tesla);
        tesla.start();

    }
}
