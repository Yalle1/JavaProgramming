package week6.day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,5,6,3,6,3,5,4,2,4,1,2,4,6,3));

        /*
        for (Integer i : list) {
            if (i<5){
                list.remove(i);
            }
        }
         */ // ConcurrentModificationException

        // list.removeIf(p -> p < 5); // This works

        System.out.println(list);

        System.out.println("--------------------------------------------");

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if (it.next()<5){
                it.remove();
            }
        }
        System.out.println(list);



    }
}
