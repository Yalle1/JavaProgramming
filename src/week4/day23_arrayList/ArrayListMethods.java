package week4.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        groceriesList.set(2,"Orange");

        groceriesList.remove(0);

        System.out.println(groceriesList);

        System.out.println("-----------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(Integer.valueOf(10));

        boolean r1 =  numbers.remove(Integer.valueOf(40));

        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("----------------------------------");

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("----------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Isam");
        names.add("Isam");
        names.add("Pontus");
        names.add("Donkey");
        names.add("Darin");
        names.add("Isam");
        names.add("Omar");

        System.out.println(names.lastIndexOf("Isam"));

        System.out.println("----------------------------------");

        boolean hasMuhtar = names.contains("Muhtar");

        boolean hasIsam = names.contains("Isam");

        System.out.println("hasIsam = " + hasIsam);

        System.out.println("hasMuhtar = " + hasMuhtar);





    }
}
