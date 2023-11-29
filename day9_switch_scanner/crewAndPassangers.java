package day9_switch_scanner;

public class crewAndPassangers {

    public static void main(String[] args) {

        int number = 50;
        String people = "";
        people = (number == 50) ? "20 Crew, 30 Passengers" :(number == 75)? "25 Crew, 50 Passengers" :(number == 100)? "30 Crew, 70 Passengers" : "Invalid numbers";

        System.out.println(people);


        System.out.println("------------------------------------------------------");


        int number2 = 50;

        String people2 = "";

        switch (number2){
            case 50:
                System.out.println("20 Crew, 30 Passengers");
                break;
            case 75:
                System.out.println("25 Crew, 50 Passengers");
                break;
            case 100:
                System.out.println("30 Crew, 70 Passengers");
                break;
            default:
                System.out.println("Invalid");


        }
    }
}
