package week2.day14_forLoop;

import java.util.Scanner;

public class ForLoopTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i <= 100; ++i){
            sum += i;
        }

        System.out.println(sum);

        System.out.println("------------------------------------------");


        for (char ch = 65; ch <= 90; ++ch ){
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.println("------------------------------------------");


        for (char ch = 90; ch >= 65; --ch){
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.println("------------------------------------------");

        int sumOfnum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            sumOfnum = sumOfnum + input.nextInt();

        }

        System.out.println(sumOfnum);



    }
}
