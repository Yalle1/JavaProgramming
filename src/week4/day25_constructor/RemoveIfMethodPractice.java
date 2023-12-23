package week4.day25_constructor;

import week3.day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));

        System.out.println(smallDogs);

        System.out.println("---------------------------------------------------");

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));

        youngDogs.removeIf(p -> p.age >= 4); // remove if age is less than or equal than 4

        System.out.println(youngDogs);

        System.out.println("---------------------------------------------------");

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));

        femaleDogs.removeIf(p -> p.gender == 'M');
        maleDogs.removeIf(p -> p.gender == 'F');

        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);

        System.out.println("---------------------------------------------------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> dogList = new ArrayList<>(Arrays.asList(dogs2));

        dogList.removeIf( p -> p.size.equalsIgnoreCase("Small") );

        dogs2 = dogList.toArray(new Dog[0]);

        System.out.println(Arrays.toString(dogs2));





    }
}
