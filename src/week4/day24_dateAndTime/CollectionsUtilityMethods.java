package week4.day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java","Java", "Java","Java","Java", "C#", "C#", "C#", "Python", "Python", "Python"));

        System.out.println(names);

        /*
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }

         */

        Collections.replaceAll(names, "Java","Python");

        System.out.println(names);



    }
}
