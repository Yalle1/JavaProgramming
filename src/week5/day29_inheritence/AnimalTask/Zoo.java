package week5.day29_inheritence.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("George","Georgian Shepherd","White","Large",'M',3);

        Cat cat = new Cat("Peter","short-hair","Black", "Medium",'M',4);

        Tiger tiger = new Tiger("Miskinaget","Siberian","Orange","XL",'M',8);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("--------------------------------------");

        dog.bark();
        cat.drink("milk");
        tiger.hunt();

    }
}
