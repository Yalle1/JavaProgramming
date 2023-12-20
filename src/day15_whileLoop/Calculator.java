package day15_whileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter second number:");
        double num2 = input.nextDouble();

        System.out.println("Enter a math operator:");
        char operator = input.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')){
            System.err.println("Invalid Operator, try again:");
            operator = input.next().charAt(0);
        }

        calculate(num1, num2, operator);


    }
    public static double calculate(double num1, double num2, char operator) {

        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
            break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
            break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
            break;
            case '/':
                if (num2 == 0) {
                    System.err.println("Cannot be divided by zero!");
                }
                result = num1 / num2;
                System.out.println(result);
            break;
            default:
                System.exit(1);
                System.err.println("error!");
        }
        return result;
    }
}

