package day22_arrayList;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class removeElementTest {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int [] newArray1 = Arrays.copyOf(array, array.length-1);

        int[] newArray = ArraysUtility.removeElement(array,0);

        System.out.println(Arrays.toString(newArray));





    }
}

// remove one index from the array (creates and returns a new array)