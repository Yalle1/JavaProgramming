package week4.day28_encapsulation.PersonTask;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Ensar","Turkish");

        System.out.println(person);

        person.eat("Chocolate");

        Person.printPlanetName();
    }
}
