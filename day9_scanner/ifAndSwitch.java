package day9_scanner;

public class ifAndSwitch {

    public static void main(String[] args) {

        int number = 75;

        if(number == 50 || number == 75 || number == 100) {

        switch(number) {

            case 50:
                System.out.println("20 crew, 30 passenger");
                break;
            case 75:
                System.out.println("25 crew, 50 passenger");
                break;
            case 100:
                System.out.println("30 crew, 70 passenger");
                break;
        }

        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
//here we combine 2 statement types, namely switch and if