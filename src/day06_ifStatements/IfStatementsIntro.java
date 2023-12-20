package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = -5555;


        if (number > 0) {

            System.out.println(number + " is postive");

        } else if (number < 0){

            System.out.println(number + " is negative");

        } else if (number == 0) {

            System.out.println(number + " is zero");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
