package week3.day17_customClass;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void eat(){
        System.out.println(name + " is eating ");
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color){

        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
