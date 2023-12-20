package day21_multiDimensionalArray;

import java.util.Arrays;

public class MDA {

    public static void main(String[] args) {

        int[][] arr2D1 = { {1,2} , {3,4,5} };

        int[][] arr2D2 = { {6,7,8,9} , {10, 11} , {12,13,14}   };

        int[][] arr2D3 = { {15,16,17,18 }};

        int[][][] arr3D = {arr2D2, arr2D2, arr2D3};

        System.out.println(Arrays.toString(arr3D[1][0]));



        System.out.println("----------------------------------------------");


        for (int[][] each2DArray : arr3D) {
            for (int[] each1DArray : each2DArray) {
                for (int eachElement : each1DArray) {
                    System.out.print(eachElement + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");


    }
}
