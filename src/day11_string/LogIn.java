package day11_string;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You are logged in");
        } else {
            System.err.println("Incorrect username or password. Please try again");
        }


    }
}
