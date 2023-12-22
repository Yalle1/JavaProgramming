package week1.day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // All relational operators return Boolean (true or false)

        int a = 1000;
        int b = 200;

        System.out.println(a > b); // is 1000 greater than 200 (equals "true")

        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        System.out.println("-----------------------------------------------------");
        
        int score = 75;
        
        boolean passedExam = score >= 60;
        System.out.println("passedExam = " + passedExam);

        System.out.println("-----------------------------------------------------");

        int age = 21;

        boolean ofAge = age >= 21;

        System.out.println("Can buy alcohol: " + ofAge);

        System.out.println("-----------------------------------------------------");
        
        age = 22;
        
        boolean eligableToVote = age >= 18;

        System.out.println("eligableToVote = " + eligableToVote);

        System.out.println("-----------------------------------------------------");

        System.out.println(100 > 100); // false
        System.out.println(100 >= 100); // true
        System.out.println(100 >= 85); // true

        System.out.println("-----------------------------------------------------");

        score = 50;

        boolean failed = score < 60;

        System.out.println(failed);

        System.out.println("-----------------------------------------------------");

        System.out.println("Java" == "Java");
    }
}
