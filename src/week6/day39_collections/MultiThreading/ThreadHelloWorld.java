package week6.day39_collections.MultiThreading;

public class ThreadHelloWorld extends Thread{

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello world: "+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
