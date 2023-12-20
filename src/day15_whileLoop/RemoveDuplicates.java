package day15_whileLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter in sentence / whatever");
        String str = input.nextLine().toLowerCase();

        String result = "";



        for (int i = 0; i < str.length(); i++){
            if (result.contains("" + str.charAt(i))){
                continue;
            }
            result += str.charAt(i);

        }
        System.out.println(result);

        System.out.println("---------------------------------------");

        // find the sum of all even numbers between 50 ~  100;


        int sum = 0;

        for (int i = 50; i < 101 ; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;

        }
        System.out.println(sum);
    }
}
