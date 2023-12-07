package day13_customMethods;


import java.util.Scanner;

public class customMethods2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        eligibleToVote(scanner);
    }

    public static void eligibleToVote(Scanner input) {
        System.out.println("Are you an American? (Yes/No)");
        String noYes = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();

        if (age >= 21 && "yes".equalsIgnoreCase(noYes)) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You cannot vote!");
        }
    }
}
