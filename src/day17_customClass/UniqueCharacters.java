package day17_customClass;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine();

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (str.indexOf(letter) == str.lastIndexOf(letter)){
                unique += letter;
            }
        }
        System.out.println(unique);
    }
}
