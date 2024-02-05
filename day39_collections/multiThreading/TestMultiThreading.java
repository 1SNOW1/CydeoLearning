package day39_collections.multiThreading;

public class TestMultiThreading {

    public static void main(String[] args) {

        ThreadHelloWorld thread1 = new ThreadHelloWorld();
        ThreadHelloWorld thread2 = new ThreadHelloWorld();
        ThreadHelloWorld thread3 = new ThreadHelloWorld();
        ThreadHelloWorld thread4 = new ThreadHelloWorld();
        ThreadHelloWorld thread5 = new ThreadHelloWorld();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();



    }
}
