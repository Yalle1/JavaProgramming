package day16_nestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;

        int attempts = 0;



        do {

            System.out.println("Enter your username:");
            u = input.nextLine();

            System.out.println("Enter your password:");
            p = input.nextLine();

            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon")) && attempts < 2){
                System.err.println("Invalid username or password, try again");
            }

            attempts++;

            if (attempts == 3 && !(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.err.println("Too many attempts, try again later!");
                System.exit(1);
            }

        }while ( !(u.equals("Cydeo") && p.equals("WoodenSpoon")));

        System.out.println("Logged in");

    }
}
