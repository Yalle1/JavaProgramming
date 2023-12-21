package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Isam");
        names.add("Isam");
        names.add("Pontus");
        names.add("Darin");
        names.add("Darin");
        names.add("Isam");
        names.add("Omar");

        ArrayList<String> nonDup = new ArrayList<>();


        for (String name : names) {
            if (!(nonDup.contains(name))) {
                nonDup.add(name);
            }
        }

        names = nonDup;

        System.out.println(names);
    }
}
