package day4_contatenation;

public class shippingAdress {

    public static void main(String[] args) {

        String name = "Enes orhan",
                buildingNumber = "Fagerlidsvägen 23",
                streetName = "Stockholm, Tullinge";

        int zipCode = 146_30;


        System.out.println("Your shipping address is \n" + name + "\n" + buildingNumber + "\n" + streetName + "\n" + zipCode );
    }
}
