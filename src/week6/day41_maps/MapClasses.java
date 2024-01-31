package week6.day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(); // random order, accepts only one null key and multiple null values, fastest one

        map.put("John",10000);
        map.put("George",120000);
        map.put(null,120000);
        map.put("Max",null);

        System.out.println("HashMap = "+map); // Insertion order is not kept / order is random

        System.out.println("-----------------------------------------------------------");

        Map<String, Integer> map2 = new LinkedHashMap<>(); // insertion order, accepts only one null key and multiple null values,

        map2.put("John",10000);
        map2.put("George",120000);
        map2.put(null,120000);
        map2.put("Max",null);

        System.out.println("LinkedHashMap = "+map2); // Insertion order is kept

        System.out.println("-----------------------------------------------------------");

        Map<String, Integer> map3 = new TreeMap<>(); // sorted ascending order, doesn't accept null key but accepts null values

        map3.put("John",10000);
        map3.put("George",120000);
        // map3.put(null,120000); ===> This doesn't work as null key isn't accepted
        map3.put("Max",null);

        System.out.println("TreeMap = "+map3); // insertion order is ascending

        System.out.println("-----------------------------------------------------------");

        Map<String, Integer> map4 = new Hashtable<>(); // random order, doesn't accept null key and null values, is synchronized (Thread-Safe)

        map4.put("John",10000);
        map4.put("George",120000);
        // map4.put(null,120000); // Hashtable doesn't allow key & value to be null
        // map4.put("Max",null); // -II-

        System.out.println("Hashtable = "+map4);

    }
}
