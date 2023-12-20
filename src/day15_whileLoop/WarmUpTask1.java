package day15_whileLoop;

import java.util.Scanner;

public class WarmUpTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;


        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number > max){
                max = number;
            }
        }

        System.out.println();

        System.out.println("Max number is: " + max);

        input.close();

    }
}
