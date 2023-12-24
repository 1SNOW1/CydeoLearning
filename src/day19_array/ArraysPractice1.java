package day19_array;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0] = "Ömer";
        myGroup[1] = "Eyyup";
        myGroup[2] = "Ay evelyn";
        myGroup[3] = "Art hoxa";
        myGroup[4] = "Cundullah";

        for (int i = 0; i < myGroup.length ; i++) {
            System.out.println(myGroup[i]);
        }

        System.out.println("-----------------------------------");

        //what if I want to display the names in reverse order, meaning from last to first one in myGroup
        for (int i = myGroup.length-1; i >= 0 ; i--) {
            System.out.println(myGroup[i]);
        }


        System.out.println("---------------------------------------");


        int[] numbers = new int[100];
        int allNumbers = 0;
        for (int i = 0; i < myGroup.length; i++) {
            
        }
    }
}