package week4.day28_encapsulation.PersonTask;

public class Person {


    String name, language;
    int age;
    char gender;

    static String planet;
    static boolean isHuman, hasNose;
    static int numberOfWings, numberOfHeads;

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age){
        this(name);
        this.age = age;
    }

    Person(String name, String language){
        this(name);
        this.language = language;
    }

    Person(String name, char gender){
        this(name);
        this.gender = gender;
    }

    Person(String name, int age, char gender){
        this(name, age);
        this.gender = gender;
    }
    Person(String name, int age, char gender, String language){
        this(name, age, gender);
        this.language = language;
    }

    static void printPlanetName(){
        System.out.println(planet);
    }

    void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}
