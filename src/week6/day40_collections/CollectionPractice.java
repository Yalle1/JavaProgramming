package week6.day40_collections;

import java.util.*;

public class CollectionPractice {


    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.addAll(Arrays.asList(100,300,2000,400));


        System.out.println(((ArrayList<Integer>)collection).get(2));

        List<Integer> list = new LinkedList<>(Arrays.asList(null,1,2,3,null));

        System.out.println(list);





    }
}
