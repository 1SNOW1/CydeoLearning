package day8_ternary_switch;

public class elevator {

    public static void main(String[] args) {

        int floorNumber = 1;

        if (floorNumber >= 1 && floorNumber <= 10) {

            if (floorNumber == 1) {
                System.out.println("Floor 1 selected \nCompanies : Lobby, Verizon, Starbucks");
            }
            else if (floorNumber == 2) {
                System.out.println("Floor 2 selected \nCompanies : Cybertek , Nasa, Intelsat");
            }
            else if  (floorNumber == 3) {
                System.out.println("Floor 3 selected \nCompanies : Lyft, bofA, Stake house");
            }
            else {
                System.out.println("Invalid floor, please choose another");
            }
        }
    }
}
