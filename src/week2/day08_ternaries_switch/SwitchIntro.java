package week2.day08_ternaries_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'D';
        String result = "";

        switch (grade) {

            case 'A':
                result = "Excellent";
                break;
                
            case 'B':
                result = "Great Job";
                break;
                
            case 'C':
                result = "Good";
                break;
                
            case 'D':
                result = "Passed";
                break;
                
            case 'F':
                result = "Failed";
                break;

            default:
                System.err.println("Invalid");

        }
        System.out.println("result = " + result);

    }
}

/*

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

 */