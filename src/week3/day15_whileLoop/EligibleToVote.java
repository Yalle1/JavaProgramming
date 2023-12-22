package week3.day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid age should be 1 ~ 120

        int attempts = 0;


        while (!(age > 0 && age < 121 || attempts > 4)) {
            System.err.println("Invalid age, re-enter age:");
            age = input.nextInt();
            attempts += 1;

        }

        if (attempts > 4) {
            System.err.println("Too many attempts, come back later!");
            System.exit(1);
        }

        if (age < 18){
            System.out.println("Cannot vote");
            System.exit(1);
        }

            input.nextLine();

            System.out.println("Are you a US citizen? Yes/No");
            String yesOrNo = input.nextLine().toLowerCase();

            attempts = 0;

            while (!(yesOrNo.equals("yes") || yesOrNo.equals("no") || attempts > 4)) {
                System.err.println("Invalid answer! try again:");
                System.err.println("Are you a US citizen? Yes/No");
                yesOrNo = input.nextLine();
                attempts += 1;
            }

            if (attempts > 4) {
                System.err.println("Too many attempts, come back later!");
                System.exit(1);

            } else if (age > 17 && yesOrNo.equals("yes")) {
                System.out.println("You can vote");
            } else {
                System.out.println("You cannot vote");
            }


            input.close();

        }
    }


