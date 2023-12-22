package week2.day11_string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 strings: ");

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if (str1.length() > str2.length()) {
            System.out.println("String 1 is longer");
        } else if (str2.length() > str1.length()) {
            System.out.println("String 2 is longer");
        } else if (str2.length() == str1.length()) {
            System.out.println("They are equally long");
        } else {
            System.err.println("Invalid input");
        }

    }
}
