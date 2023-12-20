package day13_customMethods;

import java.util.Scanner;

public class WarmUpTasks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter in two numbers and one math operator:");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        char mathOperator = input.next().charAt(0);

        calculate(num1,num2,mathOperator);

    }

    public static void calculate(double num1, double num2, char mathOperator) {


        double total = 0;

        switch (mathOperator) {
            case '+':
                total = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + total);
                break;
            case '-':
                total = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + total);
                break;
            case '*':
                total = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + total);
                break;
            case '/':
                total = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + total);
                break;
            case '%':
                total = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + total);
                break;
            default:
                System.err.println("Error!");
                System.exit(1);
        }


    }
}
