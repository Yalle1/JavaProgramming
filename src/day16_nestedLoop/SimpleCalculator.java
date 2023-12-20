package day16_nestedLoop;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String yesOrNo;

        do {

            System.out.println("Enter a number:");
            double num1 = input.nextDouble();

            System.out.println("Enter a math operator: (-, +, *, /)");
            char operator = input.next().charAt(0);

            int attempts = 0;

            while (!(operator == '-' || operator == '+' || operator == '*' || operator == '/')) {
                System.err.println("Invalid operator, try again: (-, +, *, /)");
                operator = input.next().charAt(0);
                attempts++;
                if (attempts == 3 && !(operator == '-' || operator == '+' || operator == '*' || operator == '/')) {
                    System.err.println("Too many attempts, try again later!");
                    System.exit(1);
                }
            }

            System.out.println("Enter the second number:");
            double num2 = input.nextDouble();

            input.nextLine();

            double sum = 0;

            switch (operator) {
                case '+':
                    sum = num1 + num2;
                    break;
                case '-':
                    sum = num1 - num2;
                    break;
                case '*':
                    sum = num1 * num2;
                    break;
                case '/':
                    sum = num1 / num2;
            }


            System.out.println("Result = " + sum);

            System.out.println("Would you like to continue? (Yes/No)");
            yesOrNo = input.nextLine().toLowerCase();

            while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
                System.err.println("Invalid answer, try again");
                yesOrNo = input.nextLine();
                attempts++;
                if (attempts == 3 && !(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
                    System.err.println("Too many attempts, try again later!");
                    System.exit(1);
                }
            }

        } while (true);




    }
}
