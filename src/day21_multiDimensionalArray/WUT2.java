package day21_multiDimensionalArray;

import java.util.Arrays;

public class WUT2 {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1,a2);

        System.out.println(isAnagram);

    }
}
