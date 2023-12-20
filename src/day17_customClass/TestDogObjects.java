package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "George";
        dog1.breed = "Pitbull";
        dog1.color = "Black";
        dog1.size = "Large";
        dog1.gender = 'M';
        dog1.age = 5;

        dog1.drink();
        dog1.eat();

        Dog dog2 = new Dog();

        dog2.setInfo("Max","Labrador","Medium",'M',3,"Brown");

        System.out.println(dog1);

        System.out.println(dog2);

    }
}
