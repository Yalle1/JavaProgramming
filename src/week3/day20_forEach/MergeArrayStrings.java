package week3.day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrayStrings {

    public static void main(String[] args) {

        int [] n1 = {1};
        int [] n2 = {2};

        int[] intMerged = ArraysUtility.merge(n1,n2);
        System.out.println(Arrays.toString(intMerged));

        String[] s1 = {"Hello","World"};
        String[] s2 = {"Ensar", "Yalap"};
        String[] merged = ArraysUtility.merge(s1,s2);

        System.out.println(Arrays.toString(merged));

        int [] n = {1,2,3,4,5};

        int [] reversed = ArraysUtility.reversedArray(n);

        System.out.println(Arrays.toString(reversed));


    }
}


