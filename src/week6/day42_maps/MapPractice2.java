package week6.day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);

        List<Map<String, Object>> listOfEmployees = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        System.out.println(listOfEmployees.get(0));

        for (Map<String, Object> listOfMap : listOfEmployees) {
            for (Map.Entry<String, Object> entry : listOfMap.entrySet()) {


            }
        }

        System.out.println("----------------------------------------------");

        // Display the names of the employee that got hired the year: 2022

        /*
        for (Map<String, Object> listOfMap : listOfMaps) {
            for (Map.Entry<String, Object> entry : listOfMap.entrySet()) {


                if (entry.getKey().equals("hired_date")) {

                    LocalDate year = (LocalDate) entry.getValue();


                    if (year.getYear() == 2022) {
                        System.out.println(" : " + entry.getValue());

                    }
                }

            }
        }

         */


        /*
        for (Map<String, Object> listOfMap : listOfMaps) {
            for (String key : listOfMap.keySet()) {
                String name = "";
                if (key.equals("name")) {
                    name = (String) listOfMap.get("name");

                    for (Object hired : listOfMap.values()){
                        LocalDate year = (LocalDate) listOfMap.get("hired_date");
                        if (hired instanceof LocalDate) {
                            if (year.getYear() == 2022) {
                                System.out.println(name + " : " + listOfMap.get("hired_date"));

                            }
                        }
                    }
                }

         */

        for (Map<String, Object> person : listOfEmployees) {

            LocalDate hiredDate = (LocalDate) person.get("hired_date");

            if (hiredDate.getYear() == 2022) {
                System.out.println(person.get("name") + " : " + hiredDate);
            }

        }
        System.out.println("----------------------------------------------");

        listOfEmployees.get(0).replace("name","Arthur","George");
        listOfEmployees.get(listOfEmployees.size()-1).replace("salary", (Integer) listOfEmployees.get(listOfEmployees.size()-1).get("salary")+50000);
        listOfEmployees.get(1).replace("age",listOfEmployees.get(1).get("age"), 28);

        System.out.println(listOfEmployees);

    }
}
