package week3.day19_arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int[] score = new int[5];


        score[0] = 85;
        score[1] = 75;
        score[2] = 78;
        score[3] = 88;
        score[4] = 95;

        System.out.println("Scores equal = " + Arrays.toString(score));

        System.out.println(score[2]);

        System.out.println("-----------------------------------");

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        System.out.println("-----------------------------------");

        System.out.println(score[score.length-score.length]); // first value
        System.out.println(score[score.length-1]);            // last value







    }
}
