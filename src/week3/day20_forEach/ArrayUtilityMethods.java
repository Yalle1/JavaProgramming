package week3.day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};
        int[] score2 = {100, 23, 423, 2};

        System.out.println(Arrays.toString(score));

        boolean r1 = Arrays.equals(score, score2);

        System.out.println(r1);


        System.out.println("---------------------------------------");


        int[] score3 = {1,2,3,4,5};
        int[] score4 = {5,4,3,2,1};

        Arrays.sort(score4);

        boolean r2 = Arrays.equals(score3,score4);

        System.out.println(r2);

        System.out.println("---------------------------------------");


        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        System.out.println(Arrays.equals(ch1,ch2)); // False

        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2)); // True

        System.out.println("---------------------------------------");


        String [] students = {"James", "Ali", "Abby", "Baba"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------");

        int[] arr = {10,20,30,40,50,60};

        int[] arr2 = Arrays.copyOf(arr,arr.length);

        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------------------");

        int[] n = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10};

        int[] n3 = Arrays.copyOf(n, n.length+n2.length);


        for (int i = 0, j = n.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("---------------------------------------");

        char[] ch = {'A','B','C','D','E','F','G'};

        char[] result1 = Arrays.copyOf(ch,4); //from index 1 ~ 3 (begins for first index to specified index)

        char[] result2 = Arrays.copyOfRange(ch,2,4); //from index 2 ~ 3 (begins from specified index and ends with specified index) & (Excludes ending index, give ending index 5 to get character 'E')

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));


    }
}
