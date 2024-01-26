package week6.day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        String str = "Java";

        // char ch = str.charAt(250); // unchecked exception, (StringIndexOutOfBoundsException)

        // Pizza pizza = null;        // unchecked exception, (NullPointerException)
        // pizza.calcCost();

        // System.out.println( 50 / 0 ); // unchecked exception, (ArithmeticException)


        // ----------------------------------------------------

        int score = 100;

        if (score > 59){
            System.out.println("Your grade is: D");
        } else if (score > 70){
            System.out.println("Your grade is: C");
        }

        // ----------------------------------------------------

        // FileInputStream file = new FileInputStream(""); // checked exception, (Unhandled exception)

        // Thread.sleep(3000); // checked exception



    }
}
