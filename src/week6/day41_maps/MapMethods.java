package week6.day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<Integer, String > employees = new TreeMap<>();

        employees.put(123,"Miskinaget");
        employees.put(213,"Baba");
        employees.put(423,"Gorge");
        employees.put(243,"Peter");
        employees.put(143,"Jafar");
        employees.put(573,"Ahmed");

        System.out.println(employees.size());
        System.out.println();



    }
}
