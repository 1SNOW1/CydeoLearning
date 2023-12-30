package day12_customMethods;

public class emailTask {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0, email.indexOf("_")),
                lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")),
                    rest = email.substring(email.indexOf("@"));

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("rest = " + rest);

        email = lastName + "_" + firstName + rest;

        System.out.println(email);
    }
}
