package week3.day15_whileLoop;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = Integer.MAX_VALUE;


        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number < min){
                min = number;
            }
        }

        System.out.println();

        System.out.println("Min number is: " + min);

        input.close();

    }
}
