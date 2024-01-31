package week6.day41_maps;

import Utilities.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));

        List<List<Integer>> lists = new ArrayList<>();

        lists.addAll(Arrays.asList(list1,list2));

        System.out.println(lists);


    }
}
