package week2.day12_customMethods;

import java.util.Scanner;

public class CydeoSchool {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first name:");
        String firstName = input.nextLine().trim();

        System.out.println("Input second name:");
        String secondName = input.nextLine().trim();

        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        secondName = secondName.toUpperCase().charAt(0) + secondName.substring(1).toLowerCase();

        System.out.println(firstName + " " + secondName);
    }
}
