package week6.day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<Integer, String > employees = new HashMap<>();

        employees.put(123,"John");
        employees.put(213,"Tom");
        employees.put(423,"George");
        employees.put(243,"Peter");
        employees.put(143,"Mustafa");
        employees.put(573,"Ahmed");

        System.out.println(employees);

        Map<Integer, String> map = new HashMap<>(employees);

        System.out.println(map);

        System.out.println(map.equals(employees));

    }
}
