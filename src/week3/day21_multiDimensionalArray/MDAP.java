package week3.day21_multiDimensionalArray;

import java.util.Arrays;

public class MDAP {

    public static void main(String[] args) {

        String[] group1 = {"George", "Pontus","Tim","Isam"};
        String[] group2 = {"Hamza","Peter","Patrick"};
        String[] group3 = {"Linus", "Johnson","Muhtar","Abdulaziz","Omar"};
        String[] group4 = {"Cevdet","Osama"};

        String[][] groups = {group1, group2, group3, group4};

        int count = 0;

        for (String[] group : groups) {
            count++;
            System.out.println("Group: " + count);
            for (String students : group) {
                System.out.println("- "+students);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        count = groups.length+1;

        for (int i = groups.length - 1; i >= 0; i--) {

            count--;
            System.out.println("Group: " + count);
            for (int j = groups[i].length - 1; j >= 0; j--) {
                System.out.println("- "+groups[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");

        System.out.println(Arrays.deepToString(groups));


    }
}
