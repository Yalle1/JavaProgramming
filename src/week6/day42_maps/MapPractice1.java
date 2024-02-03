package week6.day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        // Find how many males and females there are in the employeeMap

        int m = 0;
        int f = 0;
        for (String eachValue : employeeMap.values()) {
            if (eachValue.equalsIgnoreCase("m")){
                m++;
            } else {
                f++;
            }
        }

        System.out.println("Males : " + m+"\nFemales : "+f);

        System.out.println("-------------------------------------------");

        // Display the names of all the female employees

        /*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);

            if (gender.equalsIgnoreCase("f")){
                System.out.println(name);
            }
        }

         */

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("f")){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("-------------------------------------------");

        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> entry : employeeMap.entrySet()){
            if (entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
            } else {
                entry.setValue("Female");
            }
        }

        System.out.println(employeeMap);



    }
}
