package day13_customMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        boolean oddOrEven = isOdd(2);

        System.out.println(oddOrEven = false);


    }

    public static boolean isOdd(int number){
       return number % 2 != 0;
    }
}
