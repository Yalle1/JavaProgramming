package week6.day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(); // order is random, child-class of Set, allows null
        Set<Integer> set2 = new LinkedHashSet<>(); // insertion order is kept, child-class of HashSet, allows null
        Set<Integer> set3 = new TreeSet<>(); // makes the order ascended (smallest to biggest), child-class of SortedSet, does not allow null

        set1.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(set1);

        System.out.println("-------------------------------------");

        String[] words = {"Java","Java","Java","Java","Python","Python","C#","C++","Ruby","C#","C#"};

        Set<String> words2 = new HashSet<>(Arrays.asList(words));

        System.out.println("-------------------------------------");

        List<Integer> integers = new ArrayList<>(Arrays.asList(10,10,10,10,20,30,30,30,60,60));

        Set<Integer> integers1 = new TreeSet<>(integers); // converts ArrayList to TreeSet (they dont have IS A RELATIONSHIP,
                                                          // but every collections-class has a constructor that takes collection-type as argument)

        System.out.println(integers1);

        Integer [] arr = integers1.toArray(new Integer[0]); // converts TreeSet to an Integer Array

        System.out.println(Arrays.toString(arr));

        System.out.println(new ArrayList<>(integers1).get(1)); // gets second element of TreeSet
        System.out.println(arr[1]); // also gets second element but gets it from the normal Array



    }
}
