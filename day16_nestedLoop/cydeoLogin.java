package day16_nestedLoop;

import java.util.Scanner;

public class cydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String username = input.nextLine();

        System.out.println("Please enter your password: ");
        String password = input.nextLine();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You have successfully logged in!");
        }else {

            for (int i = 0; i < 3 ; i++) {
                System.err.println("Incorrect username or password, please try again");
                System.out.println("Enter your username: ");
                username = input.nextLine();


                System.out.println("Enter your password: ");
                password = input.nextLine();


                if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
                    System.out.println("You are logged in!");
                    break;
                }


            }
            if (! (username.equals("Cydeo") && password.equals("WoodenSpoon"))){
                System.err.println("You are now locked, please contact the support team");
            }
        }










    }
}