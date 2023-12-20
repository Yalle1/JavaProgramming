package day09_scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.print("Is the following number odd or even?: ");

        int number = input.nextInt();

        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        System.out.println(result);


        input.close();
    }
}
