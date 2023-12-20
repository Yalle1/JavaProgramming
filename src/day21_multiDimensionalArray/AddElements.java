package day21_multiDimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;

        int[] newArray = Arrays.copyOf(array,array.length+1);

        newArray[newArray.length-1] = element;

        System.out.println(Arrays.toString(newArray));

        int[] addedElementArray = ArraysUtility.addElement(array,5);

        System.out.println(Arrays.toString(addedElementArray));

        System.out.println("---------------------------------");

        String[] str = {"Hello", "World"};

        str = ArraysUtility.addElement(str,"Donkey");

        System.out.println(Arrays.toString(str));

    }

}
