package week3.day19_arrays;

public class AP4 {

    public static void main(String[] args) {

        /*
        int[] num = new int[3];
        num[0] = 324;
        num[1] = 11;
        num[2] = 2321;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println(min);

         */

        int[] num = {121,34,342,22};

        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (min > num[i]){
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
