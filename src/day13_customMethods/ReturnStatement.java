package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {

    eligible(-12);

    }

    public static void eligible(int age) {
        if (age < 0 || age > 150){
            System.out.println("Invalid age");
            return;
        }

        if (age > 20) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

    }
}
