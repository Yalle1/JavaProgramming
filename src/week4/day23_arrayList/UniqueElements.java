package week4.day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Isam");
        names.add("Isam");
        names.add("Pontus");
        names.add("Darin");
        names.add("Darin");
        names.add("Isam");
        names.add("Omar");


        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
            }
        }





    }
}
