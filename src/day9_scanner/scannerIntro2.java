package day9_scanner;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class scannerIntro2 {

    public static void main(String[] args) {


        System.out.println("Enter a rational number: ");

        Scanner input = new Scanner(System.in);

        double dub1 = input.nextDouble();

        System.out.println("You entered: "+dub1);

        System.out.println("Enter a true or false");

        boolean boo1 = input.nextBoolean();

        input.close();

        System.out.println("what you entered was : "+boo1);
    }
}
