package week6.day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accepts only one null key and multiple null values, fastest one

        map.put("John",10000);
        map.put("George",11000);
        map.put("Tom",120000);
        map.put("Max",95000);

        // Iterating the map by the keys

        for (String eachKey : map.keySet()) {

            map.replace(eachKey, map.get(eachKey)*2 );

        }

        System.out.println(map);

        System.out.println("-----------------------------------------------");

        // Iterating the map by the values

        for (Integer eachValue : map.values()) {

            System.out.println(eachValue);

        }

        System.out.println("-----------------------------------------------");

        // Iterating the map by the entries / pairs


        for (Map.Entry<String, Integer> eachEntry : map.entrySet()){
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();

            System.out.println(eachKey);
            System.out.println(eachValue);

            eachEntry.setValue(eachValue*2);

        }

        System.out.println(map);







    }
}
