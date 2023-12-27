package week4.day27_accessModifiers;

public class TestNestedClassObject {
    public static void main(String[] args) {

        Car obj1 = new Car();  // car object

        obj1.new CarEngine();

        new Car.StaticInnerClass();


    }
}
