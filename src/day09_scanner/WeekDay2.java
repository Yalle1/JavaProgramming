package day09_scanner;

import java.util.Scanner;

public class WeekDay2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.println("Enter a number in between 1 - 7: ");
        int day = input.nextInt();

        switch (day){

            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wedensday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                System.err.println("Invalid Input");
        }

        System.out.println(result);

        input.close();
    }
}
