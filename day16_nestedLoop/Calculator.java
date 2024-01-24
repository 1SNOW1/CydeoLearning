package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter your first number: ");
            double firstNumber = input.nextDouble();

            System.out.println("Now enter your math operator (-, +, *, /)");
            char mathOperator = input.next().charAt(0); //use charAt(0) to get the first character

            System.out.println("Enter your second number: ");
            double secondNumber = input.nextDouble();

            double result = 0;

            if (mathOperator == '+') {
                result = firstNumber + secondNumber;
            } else if (mathOperator == '-') {
                result = firstNumber - secondNumber;
            } else if (mathOperator == '*') {
                result = firstNumber * secondNumber;
            } else if (mathOperator == '/') {
                //check for division by zero
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Cannot divide by zero. Please try again: ");
                    continue; // skip the rest of the loop and start over
                }
            } else {
                System.out.println("Invalid operator, try again: ");
                continue; // skip the rest of the loop and start over
            }
            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (Yes/No)");
            String answer = input.next().toLowerCase();

            if (answer.equals("no")) {
                break;
            }
        } while (true); //infinite loop user can break out with "no"

        System.out.println("Calculator closed");

    }
}
