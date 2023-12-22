package week2.day12_customMethods;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("\tCreate an Email!");
        System.out.println("Enter in your first name:");
        String firstName = input.nextLine().trim();
        System.out.println("Enter in your second name:");
        String lastName = input.nextLine().trim();

        firstName = firstName.substring(0).toLowerCase();
        lastName = lastName.substring(0).toLowerCase();

        String email = lastName + "_" + firstName + "@gmail.com";

        System.out.println(email);








    }
}
