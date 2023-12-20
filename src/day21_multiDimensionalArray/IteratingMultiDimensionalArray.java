package day21_multiDimensionalArray;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} };

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length ; j++){
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        for (int[] each1DArray: arr2D){

            for (int eachElement : each1DArray){
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.print(eachElement+" ");
            }
            System.out.println();
        }


    }
}
