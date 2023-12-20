package day21_multiDimensionalArray;

import Utilities.ArraysUtility;

public class TestContains {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        boolean contains = ArraysUtility.contains(array,6);

        System.out.println(contains);

        System.out.println("-------------------------------");

        String[] str = {"George", "Peter"};

        boolean containsStr = ArraysUtility.contains(str,"George");
        System.out.println(containsStr);

    }
}
