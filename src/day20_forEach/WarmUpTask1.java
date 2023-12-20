package day20_forEach;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 ){
                continue;
            }
            numbers[i] *= 2;
        }

        System.out.println(Arrays.toString(numbers));



    }
}
