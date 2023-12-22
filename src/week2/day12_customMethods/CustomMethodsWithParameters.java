package week2.day12_customMethods;

import java.util.Scanner;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Odd Or Even calculator - Enter in a number:");
        int num = input.nextInt();


        System.out.print("The number you entered in was: ");
        oddOrEven(num);
        eligibleOrNot(12);
        grade(99);

    }

    public static void oddOrEven(int num){
        if ((num % 2) == 0) {
            System.out.println("Even");
        } else if ((num % 2) != 2) {
            System.out.println("Odd");
        } else {
            System.out.println("Zero");
        }


    }

    public static void eligibleOrNot(int age){

        if (age > 17 ){
            System.out.println("Eligable");
        } else {
            System.out.println("Not Eligable");
        }
    }

    public static void grade(int score){
        if (score < 101 && score > -1){
            if (score > 89) {
                System.out.println("A");
            } else if (score > 79) {
                System.out.println("B");
            } else if (score > 69) {
                System.out.println("C");
            } else if (score > 59) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.err.println("Invalid input");
        }
    }
}
