package day09_scanner;

import java.util.Scanner;

public class EligableOrNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("You want to buy alcohol? ");

        String answer = input.nextLine();
        answer = answer.toLowerCase();

        if (answer.equals("yes") || answer.equals("no")){
            if (answer.equals("yes")) {
                System.out.println("What is your age? ");

                int age = input.nextInt();

                if (age > -1 && age < 131) {
                    if (age >= 21){
                        System.out.println("Here you go, that will be $5");
                    } else if (age < 21) {
                        System.err.println("No way, you are too young");
                    }

                } else {
                    System.err.println("No one is that age!");
                }

            } else if (answer.equals("no")) {
                System.out.println("Okay then... MASHALLAH ABI");

            } else {
                System.err.println("invalid answer");
            }

        } else {
            System.err.println("invalid answer");
        }

        input.close();

    }
}
