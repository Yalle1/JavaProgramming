package day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the \"Frequency Of A Word Tool\"");

        System.out.println("Enter in any String value:");
        String str = input.nextLine().toLowerCase();

        System.out.println("Enter in the word you want to see the frequency of:");
        String word = input.next().toLowerCase();

        input.nextLine();

        int count = 0; //how many there is of a word

        while (str.contains(word)){
            count++;
            str = str.replaceFirst(word,"");
        }

        System.out.println(count);
    }
}

//if the same word is repeated make a function that counts the number of times it does it.
// make sure each word is counter seperately instead of the index number






//string length - word length (Hello Hello) 11 string ||||| 4 word ||||||| 11 - 8 = 3