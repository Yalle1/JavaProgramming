package day20_forEach;

import java.util.Arrays;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers ={1,0,2,3,4,5};

        for (int each : numbers){
            if (each % 2 != 0)
            System.out.println(each);
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers) {
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------");

        int[] nums = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9,10};

        int[] nums3 = new int[nums.length+nums2.length];

        int k = 0;

        for (int each : nums) {
            nums3[k++] = each;
        }

        for (int each : nums2) {
            nums3[k++] = each;
        }

        System.out.println(Arrays.toString(nums3));

        System.out.println("-------------------------------------");

        String[] names = {"Abidullah Hamza", "Ali George", "Bob Lee"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ") +1));
        }




    }
}
