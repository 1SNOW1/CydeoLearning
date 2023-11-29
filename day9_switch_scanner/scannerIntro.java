package day9_switch_scanner;

import java.util.Scanner;
public class scannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number : ");

        int num1 = input.nextByte();

        System.out.println("Enter your second number : ");

        short num2 = input.nextShort();

        System.out.println("First number : "+num1);
        System.out.println("Second number : "+num2);
    }
}
