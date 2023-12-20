package day19_arrays;

import java.util.Arrays;

public class AP3 {

    public static void main(String[] args) {

/*
        int[] numbers = new int[3];

        int max = Integer.MIN_VALUE;

        numbers[0] = 1;
        numbers[1] = 6;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);

 */

        int [] numbers = {1,2,3,4,5};

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);




    }
}
