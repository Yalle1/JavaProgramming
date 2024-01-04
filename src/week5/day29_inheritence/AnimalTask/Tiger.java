package week5.day29_inheritence.AnimalTask;

public class Tiger extends Animal{

    public Tiger(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void hunt(){
        System.out.println(name+" is hunting");
    }
}
