package day11_StringMethods;

import java.util.Objects;
import java.util.Scanner;

public class logIn {

    public static void main(String[] args) {

        String correctUserName = "Cydeo";
        String correctPassWord = "WoodenSpoon";

        Scanner scannerUsername = new Scanner(System.in);


        System.out.println("Enter your username: ");
        String username = scannerUsername.nextLine();

        System.out.println("Enter your password: ");
        String password = scannerUsername.nextLine();

        scannerUsername.close();

        if ( username.equals(correctUserName) && password.equals(correctPassWord)){
            System.out.println("login successful");
        }
        else{
            System.out.println("Wrong Username or Password, please try again :");
        }




    }
}
