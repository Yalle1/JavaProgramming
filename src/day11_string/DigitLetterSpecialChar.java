package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();


        if (word.length() >= 1 ){

            char firstCharacter = word.charAt(0);

            if (firstCharacter >= '0' && firstCharacter <= '9') {
                System.out.println("First character is a digit (" + firstCharacter + ")");
            } else if (firstCharacter >= 65 && firstCharacter <= 90) {
                System.out.println("First character is an uppercase letter (" + firstCharacter + ")");
            } else if (firstCharacter >= 97 && firstCharacter <= 122) {
                System.out.println("First character is a lowercase letter (" + firstCharacter + ")");
            } else {
                System.out.println("Special character " + firstCharacter);
            }

        } else {
            System.err.println("String is empty");
        }

        input.close();

}

}
