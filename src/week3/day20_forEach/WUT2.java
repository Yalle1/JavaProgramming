package week3.day20_forEach;

import java.util.Arrays;
import java.util.Scanner;

public class WUT2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("the amount of numbers you want:");
        int amount = input.nextInt();

        int[] numbers1 = new int[amount]; //4

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Enter a number: (" + (i+1) + "/" + amount + ")");
            int n = input.nextInt();
            numbers1[i] = n;
        }

        System.out.println("Enter a second amount of numbers:");
        int amount2 = input.nextInt();

        int[] numbers2 = new int[amount2];

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Enter a number: (" + (i+1) + "/" + amount2 + ")");
            int n = input.nextInt();
            numbers2[i] = n;
        }

        int[] total = new int[amount + amount2]; //equals the total amount of usable arrays



        for (int i = 0; i < amount; i++) {
            total[i] = numbers1[i];
        }

        for (int i = 0; i < amount2; i++) {
            total[amount + i] = numbers2[i];
        }



        System.out.println(Arrays.toString(total));




    }
}
