package week3.day19_arrays;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Bob";
        myGroup[myGroup.length-1] = "Jack";
        myGroup[2] = "Daniel";
        myGroup[3] = "Nathaniel";
        myGroup[myGroup.length- myGroup.length+1] = "Tom";

        System.out.println("Welcome to class, the ones attending are : " + Arrays.toString(myGroup));

        System.out.println("-------------------------------------------");

        for (int i = myGroup.length-1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("-------------------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            
        }

    }
}
