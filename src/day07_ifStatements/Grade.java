package day07_ifStatements;

public class Grade {

    public static void main(String[] args) {

        char grade = 'B';

        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else if (grade == 'F') {
            result = "Failed";
        } else {
            result = "Invalid Input";
        }
        System.out.println(result);

    }
}