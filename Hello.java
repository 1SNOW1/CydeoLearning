public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Enes");


        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("I am not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("this is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar != "Volkswagen");
        //first we make a variable then we make a condition for that variable
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);


        int ageOfClient = 17;
        String ageText = (ageOfClient >= 18) ? "over eighteen" : "still a kid";
        System.out.println("Our client is " + ageText);


        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double thirdDouble = (firstDouble + secondDouble) * 100.00;
        double remainderDouble = thirdDouble % 40.00;
        boolean hereGoesNothing = (remainderDouble == 0.00) ? true : false;
        System.out.println("hereGoesNothing " + hereGoesNothing);
        if (!hereGoesNothing) {
            System.out.println("got some remainder");
        }
    }
}
