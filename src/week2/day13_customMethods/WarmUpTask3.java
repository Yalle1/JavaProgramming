package week2.day13_customMethods;

public class WarmUpTask3 {

    public static void main(String[] args) {

        eligibleToVote(21,true);


    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if (age > 20 && isAmerican) {
            System.out.println("Eligible");
        } else {
            System.err.println("Not Eligible");
        }
        
    }
}
