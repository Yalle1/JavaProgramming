package week3.day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weekday number (1 ~ 7)");
        int n = input.nextInt();

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(days[n-1]);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Enter month number (1 ~ 12)");
        int m = input.nextInt();

        String[] months = {"Jan","Feb","Mar","Feb","Apr","May","Jun","Jul","Aug","Sep","Nov","Dec"};

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }



    }
}
