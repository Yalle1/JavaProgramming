package week5.day34_abstraction.CarTask;

public class TestCar {

    public static void main(String[] args) {

        Audi audi = new Audi("RS5","Nardo grey",2018,30000);
        Honda honda = new Honda("Type R","Black",2019,20000);
        Tesla tesla = new Tesla("Cevdet Class","Pink",2023,60000);

        audi.start();
        audi.autoPark();
        audi.stop();

        honda.start();
        honda.stop();

        tesla.autoPilot();

        System.out.println(audi);
        System.out.println(honda);
        System.out.println(tesla);


    }
}
