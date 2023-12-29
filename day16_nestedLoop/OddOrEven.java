package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }

            input.nextLine();

            System.out.println("Would you like to enter another number? Yes/No");
            answer = input.nextLine().toLowerCase();


            if (answer.equals("yes")){
                continue;
            }else if(answer.equals("no")){
                break;
            }else{
                System.out.println("Invalid answer please try answering with the form Yes or No ");
            }

        } while (!answer.equals("no"));


    }
}
