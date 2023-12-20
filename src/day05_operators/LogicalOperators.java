package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // All logical operators return Boolean (true or false)

        double salary = 60000;
        int creditScore = 650;
        int age = 25;

        boolean eligableForLoan = salary >= 30000 && creditScore >= 650 && age >= 18 ;

        System.out.println("eligableForLoan = " + eligableForLoan);

        System.out.println("-----------------------------------------------------");
        
        String answer = "Maybe";
        
        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println("validAnswer = " + validAnswer);

        System.out.println("-----------------------------------------------------");


        System.out.println(!true); // false

        String a = "yes";

        boolean yes = a == "yes"; // true
        boolean no = !yes; // false

        System.out.println(yes);
        System.out.println(no);

                
    }
}
