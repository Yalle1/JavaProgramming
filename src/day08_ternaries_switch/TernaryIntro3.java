package day08_ternaries_switch;

import javax.lang.model.SourceVersion;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 59;

        String result = (score >= 0 && score < 101) ? (score >= 60) ? "Passed" : "Failed" : "Invalid";

        System.out.println("result = " + result);


        System.out.println("-----------------------------------------------");

        int n = 1;

        String day = (n > 0 && n < 8) ? (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday" : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"

                : "Invalid";


        System.out.println("day = " + day);
    }

}
