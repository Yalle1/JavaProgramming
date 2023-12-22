package week2.day08_ternaries_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;

        String result = (score >= 60 && score <= 100) ? "Passed" : "Failed";

        System.out.println("result = " + result);

        System.out.println("-------------------------------------------");

        int age = 34;
        String result3 = "";

        String result2 = (age >= 21) ? "Eligable" : "Not eligable";

        System.out.println("result2 = " + result2);

    }

}

       /* if (age >= 21) {

            result3 = "Eligable";
        } else {
            result3 = "Not eligable";
        }

        */




