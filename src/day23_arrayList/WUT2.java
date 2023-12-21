package day23_arrayList;

import java.util.ArrayList;

public class WUT2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);



        for (Integer each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                System.out.println(each+ " ");
            }
        }



    }
}
