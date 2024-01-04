package week5.day29_inheritence.AnimalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
    public void meow(){
        System.out.println(name+" is meowing");
    }


}
