package day10_Scanner_String;


import java.util.Scanner;

public class shippingAddress {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter your full name: ");

        String name = input.nextLine();
        System.out.println("Your name is: "+name);
        System.out.println("Enter your building number: ");
        int building_number = input.nextInt();
        input.nextLine();
        System.out.println("Your building number is: "+building_number);
        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();
        input.nextLine();
        System.out.println("Your street name is: "+streetName);
        System.out.println("Enter your city: ");
        input.nextLine();
        String city = input.next();
        System.out.println("Your city is: ");
        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();
        System.out.println("Your zip code is: "+zipCode);

        System.out.println("your shipping address is: \n"+name+"\n"+building_number+"\n"+streetName+"\n"+city+"\n"+zipCode);






    }
}
