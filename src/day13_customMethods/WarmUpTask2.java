package day13_customMethods;

public class WarmUpTask2 {
    public static void main(String[] args) {

        ageGroup(34);

    }

    public static void ageGroup(int age){

        if (age < 21) {
            System.out.println("Teenager");
        } else if (age < 55) {
            System.out.println("Adult");
        } else if (age > 55) {
            System.out.println("Senior");
        }


    }

}
