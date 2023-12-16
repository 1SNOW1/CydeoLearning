package day16_nestedLoop;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int attempt = 3;
        String u, p;

        do {
            System.out.println("Enter your username: ");
            u = input.nextLine();

            System.out.println("Enter your password: ");
            p = input.nextLine();

            attempt--;

            if (attempt == 1){
                System.err.println("You've got 1 more attempt left");
            }
            if (attempt == 0){
                break;
            }

        } while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));


    }


}

