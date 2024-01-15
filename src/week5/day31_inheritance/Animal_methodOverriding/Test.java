package week5.day31_inheritance.Animal_methodOverriding;

public class Test {

    public static void main(String[] args) {

        Cat cat = new Cat("Kedi","Turkish","Medium","Red and white",'T',1922);
        Dog dog = new Dog("Kopek","Turkish","Large","Red and white",'T',1922);


        System.out.println(cat);
        System.out.println(dog);

        cat.eat();
        dog.eat();





    }
}
