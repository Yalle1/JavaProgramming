package week6.day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String,Object> person1 = new LinkedHashMap<>();

        person1.put("name","Babatunde");
        person1.put("gender",'M');
        person1.put("age",30);
        person1.put("salary","$"+30000.0);
        person1.put("isMarried",true);

        System.out.println(person1);
        System.out.println(person1.get("name"));
        System.out.println(person1.get("salary"));


    }
}
