package day12_customMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or no Split? (Yes or No)");
        String yesNo = input.next().toLowerCase();

        System.out.println("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = input.next().toLowerCase();

        double totalTip = (service.equals("excellent"))? amount * 0.25
                            :(service.equals("great"))? amount * 0.2
                            :(service.equals("good"))? amount * 0.15
                            :(service.equals("fair"))? amount * 0.1
                            : amount * 0.05;

        double totalPay = amount + totalTip;

        System.out.println("Number of people: "+numberOfPeople);
        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: "+totalTip);

        if (yesNo.equals("yes")){
            System.out.println("Total per person: " + (totalPay/numberOfPeople));
            System.out.println("Tip per person: " + (totalTip/numberOfPeople));

        }






    }
}
