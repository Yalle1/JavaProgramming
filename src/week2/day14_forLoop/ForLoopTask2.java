package week2.day14_forLoop;

import java.util.Scanner;

public class ForLoopTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = 0,
                num2 = 0,
                num3 = 0,
                num4 = 0,
                num5 = 0;

        for(int i = 0; i < 5;){
            System.out.println("Enter a number:");
            num1 = input.nextInt();
            i++;
            System.out.println("Enter a number:");
            num2 = input.nextInt();
            i++;
            System.out.println("Enter a number:");
            num3 = input.nextInt();
            i++;
            System.out.println("Enter a number:");
            num4 = input.nextInt();
            i++;
            System.out.println("Enter a number:");
            num5 = input.nextInt();
            i++;
            }
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("Number " +num1+ " is the maximum number");
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("Number " +num2+ " is the maximum number");
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("Number " +num3+ " is the maximum number");
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("Number " +num4+ " is the maximum number");
        } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            System.out.println("Number " +num5+ " is the maximum number");
        } else {
            System.err.println("Error!");
        }
    }
}
