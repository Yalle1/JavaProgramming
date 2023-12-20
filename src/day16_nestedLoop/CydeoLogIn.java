package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName = "Cydeo";
        String password = "WoodenSpoon";

        System.out.println("Enter username:");
        String userNameInput = input.nextLine();

        System.out.println("Enter password:");
        String passwordInput = input.nextLine();


        int attempts = 0;

        while (!(userNameInput.equals(userName) && passwordInput.equals(password))){

            System.err.println("Wrong username or password - Try again");

            System.out.println("Enter username:");
            userNameInput = input.nextLine();

            System.out.println("Enter password:");
            passwordInput = input.nextLine();

            attempts++;

            if (attempts == 2){
                System.err.println("Too many attempts, try again later.");
                break;
            }
        }

        if (userNameInput.equals(userName) && passwordInput.equals(password)){
            System.out.println("Logged in.");
        }






    }
}
