package week6.day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {



        System.out.println("Program 1 started");

        try {
            System.out.println(9 / 0);          // Arithmetic Exception
            System.out.println("Try block");
        } catch (ArithmeticException e){
            System.out.println("Catch block");
        }



        System.out.println("Program 1 ended");

        System.out.println("---------------------------------------");

        System.out.println("Program 2 started");

        String str = null;

        try {

            System.out.println(str.toLowerCase());

        } catch (RuntimeException e){

            System.out.println("Catch block");
        }


        System.out.println("Program 2 ended");

        System.out.println("---------------------------------------");

        System.out.println("Program 3 started");

        try {
            Thread.sleep(5000);
            System.out.println("Try block");
        }catch (InterruptedException e){
            System.out.println("Catch block");
        }


        System.out.println("Program 3 ended");
    }
}
