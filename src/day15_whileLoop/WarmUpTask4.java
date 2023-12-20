package day15_whileLoop;

import java.util.Scanner;

public class WarmUpTask4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter in sentence / whatever");
        String str = input.nextLine().toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (!result.contains("" + letter) ){
                result += letter;
            }

        }

        result = result.toUpperCase().charAt(0) + result.substring(1).toLowerCase();
        System.out.println(result);




    }
}
