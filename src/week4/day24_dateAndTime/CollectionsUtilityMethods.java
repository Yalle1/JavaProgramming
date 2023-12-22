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

        System.out.println("---------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,50,50,50,50,50,50,50,60,60,60,70,40,30));

        int frequency = Collections.frequency(list, 50);

        System.out.println(frequency);

        System.out.println("---------------------------------------");

        ArrayList<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList("Java","Java", "Java","Java","Java", "C#", "C#", "C#", "Python", "Python", "Python"));

        int count = Collections.frequency(names2, "Java");

        System.out.println(count);

        System.out.println("---------------------------------------");

        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.addAll(Arrays.asList(1,1,1,1,1,1,2,3,3,3,3,4,5,5,5,5,6,6,7));

        for (Integer each : numbers2) {
            if (Collections.frequency(numbers2, each) == 1){
                System.out.println(each);
            }
        }




    }
}
