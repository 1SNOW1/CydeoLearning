package day10_Scanner_String;

import java.util.Scanner;
public class employeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter company name: ");
        String companyName = input.nextLine();

        input.nextLine();
        System.out.println("Enter job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
        input.close();


        System.out.println("Employee's name : " + fullName);
        System.out.println("Employee's age  : " + age);
        System.out.println("Employee's gender : " + gender);
        System.out.println("Employee's company name : " + companyName);
        System.out.println("Employee's job title : " + jobTitle);
        System.out.println("Employee's salary : " + salary + "€");

    }
}
