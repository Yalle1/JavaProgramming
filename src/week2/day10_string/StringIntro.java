package week2.day10_string;

import java.lang.String;
import java.util.Scanner;
import java.lang.System;

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println("str = " + str);
        
        str = "hello";

        System.out.println("str = " + str);

        System.out.println("---------------------------------");


        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2);
                



    }
}
