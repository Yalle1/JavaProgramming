package week2.day08_ternaries_switch;

public class TernaryIntro2 {

    public static void main(String[] args) {

        int number = -1;

        String posNegZero = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("posNegZero = " + posNegZero);

        System.out.println("--------------------------------------------------------");

        int n = 8;

        String day = (n == 1) ? "Monday" : (n == 2 ) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday" : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : (n == 7) ? "Sunday" : "Invalid Input";

        System.out.println(day);

        System.out.println("--------------------------------------------------------");

        int num = 10;



    }
}
