package week6.day38_exceptions;

public class ThrowsKeywordPractice {

    public static void main(String[] args){

        System.out.println("Waiting: 3 seconds");
        wait1();
        System.out.println("Ended!");

      

    }

    public static void wait1() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
