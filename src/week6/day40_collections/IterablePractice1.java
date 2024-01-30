package week6.day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);


    }
}
