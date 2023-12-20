package day21_multiDimensionalArray;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int [][] arr5 = new int[3][4];

        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 4; j++){


                arr5[i][j] = (int) (Math.random()*10);
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int[] i : arr5){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
