package week2.day14_forLoop;

public class WarmupTasks {

    public static void main(String[] args) {

        String combined = combine("Hello","orphans").toLowerCase();

        System.out.println(combined);

        System.out.println("-------------------------------------------");


        int sum = sumOf2Numbers(1,1);

        System.out.println(sum);

        System.out.println(sumOf3Numbers(1,2,3));


    }

    public static String combine(String word1, String word2){
        if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
            word2 = word2.substring(1);
            return word1 + word2;
        } else
        return word1 + " " + word2;

    }

    public static int sumOf2Numbers(int num1, int num2){
        return num1 + num2;

    }
    public static int sumOf3Numbers(int num1, int num2, int num3){
        return sumOf2Numbers(num1, num2) + num3;
    }
}
