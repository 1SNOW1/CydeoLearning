package day8_ternary_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 2;

        if (floorNum >= 1) {

            if (floorNum == 1)
            System.out.println("Floor 1 is selected, Companies : Lobby, Verizon, Starbucks");
        }
        else if (floorNum == 2) {
            System.out.println("Floor 2 is selected, Companies : Cydeo, NASA, Intelsat");
         }
        else if (floorNum == 3) {
            System.out.println("Floor 3 is selected, Companies : Lyft, BofA, Stake house");
        }
        else{
            System.out.println("Invalid floor -6");
        }


    }
}
