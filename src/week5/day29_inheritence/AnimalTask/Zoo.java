package week5.day29_inheritence.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("George","Georgian Shepherd","White","Large",'M',3);

        Cat cat = new Cat();

        cat.setInfo("Peter","short-hair","Black", "Medium",'M',4);

        Tiger tiger = new Tiger();

        tiger.setInfo("Miskinaget","Siberian","Orange","XL",'M',8);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("--------------------------------------");

        dog.bark();
        cat.drink("milk");
        tiger.hunt();

    }
}
