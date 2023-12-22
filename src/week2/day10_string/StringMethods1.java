package week2.day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "Cydeo";
        //  index:    01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("-----------------------------------------");

        String sentence = "Java Programming Language";

        int lenght = sentence.length();

        System.out.println(lenght);

        int lastIndex = lenght -1;

        System.out.println(lastIndex);

        System.out.println("-----------------------------------------");

        //WRITE A PROGRAM THAT WILL GET THE FIRST AN LAST CHARACTERS OF A STRING AND DISPLAY THEM;

        String sentence2 = "ANA DAMMI FALASTINI";

        char firstChr = sentence2.charAt(0);
        int sentenceLengthMinus1 = sentence2.length() - 1;
        char lastChr = sentence2.charAt(sentenceLengthMinus1);

        System.out.println("First char: " + firstChr + "\nLast char: " + lastChr);

        System.out.println("-----------------------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println("-----------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r1.equals(r3)); // true

    }
}
