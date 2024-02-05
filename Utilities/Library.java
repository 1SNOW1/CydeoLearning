package Utilities;

public class Library {

    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds * 1000)); //sleep method only takes long that's why im casting it
        }catch (InterruptedException e){

        }
    }
}
