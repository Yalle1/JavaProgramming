package day23_arrayList;

import java.util.ArrayList;

public class WUT1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }

        double average = sum/list.size();


        System.out.println("The average number of: " + list + " is = " + average);


    }
}
