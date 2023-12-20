package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(2,255);

        System.out.println("numbers = " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            int n = numbers.get(i);
            System.out.println("n = " + n);
        }

        System.out.println("--------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            int n = numbers.get(i);
            System.out.println("n = " + n);
        }

        System.out.println("--------------------------");

        for (Integer each : numbers) {
            System.out.println("each = " + each);
        }


    }
}
