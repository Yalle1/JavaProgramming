package day07_ifStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 20 ;


        if (age >= 0 && age <= 130) {
            if (age >= 21) {
                System.out.println("Can vote = true");
            }
            else {
                System.out.println("Can vote = false");
            }
        } else {
            System.err.println("Invalid Input");
        }

    }

}