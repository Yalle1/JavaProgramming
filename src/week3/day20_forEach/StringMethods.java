package week3.day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch= str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));


        System.out.println("-----------------------------------------");

        char[] reverseCh = ArraysUtility.reversedArray(ch);

        System.out.println(Arrays.toString(reverseCh));

        System.out.println("--------------------------------------------------");

        String str2 = "Today is a great day to learn Java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------------------");

        String sentence = "Hello World";

        String[] reverseWords = ArraysUtility.reversedArray(sentence.split(" "));

        System.out.println(Arrays.toString(reverseWords));

        String reversedSentence = "";

        for (int i = 0; i < reverseWords.length; i++) {
            reversedSentence += reverseWords[i]+" ";

        }

        System.out.println(reversedSentence);






    }
}
