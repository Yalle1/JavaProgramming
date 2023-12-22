package week4.day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,15);

        System.out.println("list = " + list);

        System.out.println("----------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Isam");
        studentsList.add("Darin");
        studentsList.add("George");
        studentsList.add("Peter");
        studentsList.add("Johnson");

        String firstStudent = studentsList.get(0);
        String lastStudent = studentsList.get(studentsList.size()-1);

        System.out.println("studentsList = " + studentsList);
        System.out.println("firstStudent = " + firstStudent);
        System.out.println("lastStudent = " + lastStudent);








    }
}
