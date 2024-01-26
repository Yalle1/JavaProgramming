package week6.day38_exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        pausedFor5Seconds();

    }

    public static void pausedFor5Seconds() throws InterruptedException{

        Thread.sleep(5000);
    }


}
