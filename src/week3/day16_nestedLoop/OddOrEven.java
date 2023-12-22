package week3.day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "";



        do {
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }

            System.out.println("Would you like to continue? (yes/no)");
            answer = input.next().toLowerCase();

            int attempts = 0;

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.err.println(answer + " Is not a valid answer, would you like to continue? (yes/no)");
                answer = input.next().toLowerCase();
                attempts++;
                if (attempts == 3){
                    System.err.println("Too many attempts, try again later!");
                    System.exit(1);
                }
            }

        } while (!answer.equals("no"));

    }
}
