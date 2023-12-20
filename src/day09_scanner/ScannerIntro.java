package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name? ");

        String name = keyboard.nextLine();

        System.out.println("Nice to meet you " + name + "!");

        System.out.println("");


        System.out.println("Welcome to a simple addition calculator!");
        System.out.println("Please enter the first number: ");

        int num1 = keyboard.nextInt();

        System.out.println("Please enter the second number");

        int num2 = keyboard.nextInt();

        int sum = num1 + num2;

        System.out.println("The answer is: " + sum);


    }
}

