package week6.day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();    // Array based Class ===> get() is faster
        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Double linked List) ===> add(), addAll(), remove(), removeAll(), etc are faster

        arrayList.get(0);
        linkedList.get(0);

        System.out.println("--------------------------------------------");

        Vector<Integer> vector = new Vector<>();             // Array based Class (Synchronized (thread-safe) ) ===>

        vector.add(1);
        vector.add(2);
        vector.add(3);




    }


}

// process is instance of program in application
// a thread is a subset of a process, a sequence of execution within the process
