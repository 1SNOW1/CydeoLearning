package day8_ternary_switch;

public class elevator2 {

    public static void main(String[] args) {

        int floorNumber = 4;

        String result = "Invalid floor";

        if(floorNumber >= 1 && floorNumber <= 3) {

            result = "Floor "+floorNumber+" is selected. Companies: ";

            if(floorNumber == 1) {
                result += "Lobby, Verizon, Starbucks"; }
            else if (floorNumber == 2) {
                result += "Cydeo, NASA, Intelsat"; }
            else  {
                result += "Lyft, BofA, Stake house";}



        }

        System.out.println(result);
    }
}
