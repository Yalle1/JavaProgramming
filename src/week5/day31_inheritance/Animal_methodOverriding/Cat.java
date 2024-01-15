package week5.day31_inheritance.Animal_methodOverriding;

public class Cat extends Animal {

    private static boolean isCute = true;

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                ", isCute='" + isCute + '\'' + '}';
    }
}


