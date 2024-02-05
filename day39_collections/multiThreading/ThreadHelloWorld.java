package day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println("Hello World" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
