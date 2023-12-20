package day09_scanner;

import java.rmi.ServerError;
import java.util.Scanner;
public class WeekDay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.println("Enter a number in between 1 - 7: ");

        byte number = input.nextByte();

        if (number > 0 && number < 8) {
            if (number == 1) {
                result = "Monday";
            } else if (number == 2) {
                result = "Tuesday";
            } else if (number == 3) {
                result = "Wednesday";
            } else if (number == 4) {
                result = "Thursday";
            } else if (number == 5) {
                result = "Friday";
            } else if (number == 6) {
                result = "Saturday";
            } else if (number == 7) {
                result = "Sunday";
            }

            System.out.println(result);

        } else {
            System.err.println("Invalid Input");
        }


        input.close();
    }
}