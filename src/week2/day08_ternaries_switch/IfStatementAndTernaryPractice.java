package week2.day08_ternaries_switch;

public class IfStatementAndTernaryPractice {

    public static void main(String[] args) {

        int score = 70;

        String result = "";

        if (score > -1 && score < 101) {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
            
        } else {
            result = "Invalid Score";
        }

        System.out.println("result = " + result);
    }
}
