package week3.day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter in any String value:");
        String str = input.nextLine().toLowerCase();

        System.out.println("What character do you want to see the frequency of?");
        char ch = input.next().charAt(0);

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != ch){
                continue;
            }
            result += charAt;
        }

        result = result.toLowerCase();

        int finalResult = result.length();

        System.out.println(finalResult);

    }
}
