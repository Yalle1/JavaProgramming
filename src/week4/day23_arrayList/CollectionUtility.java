package week4.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5));

        Collections.sort(list);  ////////////

        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.reverse(list); /////////////

        System.out.println(list);

        



    }
}
