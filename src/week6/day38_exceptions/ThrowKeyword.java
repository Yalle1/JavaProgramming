package week6.day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age < 0 || age > 150){
            throw new InputMismatchException("Age can not be negative or above 150");
        } else if (age > 21) {
            System.out.println("Eligible");
        }else {
            System.err.println("Not eligible");
        }


    }
}
