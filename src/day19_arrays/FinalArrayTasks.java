package day19_arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class FinalArrayTasks {

    public static void main(String[] args) {

        char[] ch = new char[26];
        char[] ch2 = new char[26];

        for (int i = 0, j = 'A', k = 'Z' ; i < ch.length; i++, j++, k--) {
            ch[i] = (char) j;  //A ~ Z
            ch2[i] = (char) k; // Z ~ A
        }

        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch2));

        System.out.println("-----------------------------------------------");


        char [] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }
        System.out.println(Arrays.toString(characters));

        System.out.println("-----------------------------------------------");

        Scanner input = new Scanner(System.in);


        System.out.println("How many numbers do you want to enter?"); //asks the user to enter specific amount of numbers
        int amountOfNum = input.nextInt();                           // Takes the user input as an integer

        int[] numbers = new int[amountOfNum]; // assigns amount of numbers to array object based upon the input of the user
        int sum = 0;                          // initialization of sum variable

        for (int i = 0; i < amountOfNum; i++) {
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt(); // assigns an integer to each array index of the object
            sum += numbers[i];           // adds the given numbers to calculate the total sum
        }

        double average = sum/amountOfNum; // calculates the average by dividing the sum by the amount of numbers given in the beginning
        DecimalFormat df = new DecimalFormat("0.00"); // tool used to round decimals up to the wanted amount of decimals.


        System.out.println("Numbers = " +Arrays.toString(numbers)); // prints out the whole array
        System.out.println("sum = " + sum); // prints out the sum
        System.out.println("average = " + df.format(average));   // prints out the average






    }
}
