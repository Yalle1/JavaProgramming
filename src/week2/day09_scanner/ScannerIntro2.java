package week2.day09_scanner;


import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        input.nextLine();

        System.out.println("you have entered " + ch);
        

        System.out.println("Would you like to continue?");
        String answer = input.nextLine();

        System.out.println("You have entered " + answer);
        
    }
}
