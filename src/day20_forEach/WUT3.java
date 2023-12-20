package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class WUT3 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[i] = array[j];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));








    }
}
