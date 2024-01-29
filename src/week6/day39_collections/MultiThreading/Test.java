package week6.day39_collections.MultiThreading;

public class Test {

    public static void main(String[] args) {

        Thread t1 = new ThreadHelloWorld();
        Thread t2 = new ThreadHelloWorld();
        Thread t3 = new ThreadHelloWorld();
        Thread t4 = new ThreadHelloWorld();
        Thread t5 = new ThreadHelloWorld();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();




    }
}
