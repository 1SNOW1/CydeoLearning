package Day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {


    public static void main(String[] args) {


        String[] class1A = {"Eyyup", "Art hoxa", "Ömer", "Ay evelyn"};
        String[] class1B = {"Enes", "Orhan", "Melike", "Mirtiki"};
        String[] class1C = {"Gizem", "Kubra", "Furkan", "Hatice"};
        String[] class1D = {"Necati", "Neslihan", "Cemal", "Rukiye"};
        //now we create a 2D array to contain all the 1D arrays above
        String[][] allClasses = {class1A, class1B, class1C, class1D};

        //now we are going to display every each 1D array through a forEach-Loop
        for (String[] allClass : allClasses) {
            System.out.println(Arrays.toString(allClass));
            for (String aClass : allClass) {
                System.out.println(aClass);
            }
        }

        System.out.println("------------------------------------------------");

        for (int i = allClasses.length - 1; i >= 0; i--) {
            for (int j = allClasses.length - 1; j >= 0; j--) {
                System.out.println(allClasses[i][j]);

            }
        }

        for (int i = allClasses.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(allClasses[i]));
            for (int j = allClasses.length - 1; j >= 0; j--) {
                System.out.println((allClasses[i][j]));
            }
        }

        //deepToString method is used to display any array above 1D, meaning it can display every dimension in an array including 1D arrays
        System.out.println(Arrays.deepToString(class1A));


        System.out.println("--------------------------------------------------------------");


        String[][][] containerOfAllClasses = {allClasses};
        System.out.println(Arrays.deepToString(containerOfAllClasses));

        for (String[][] containerOfAllClass : containerOfAllClasses) {
            for (String[] ofAllClass : containerOfAllClass) {
                for (String allClass : ofAllClass) {
                    System.out.println(allClass);
                }
            }
        }

        System.out.println("----------------------------------------------------------------");


        for (String[][] containerOfAllClass : containerOfAllClasses) {
            for (String[] ofAllClass : containerOfAllClass) {
                for (int i = ofAllClass.length-1; i >= 0; i--) {
                    System.out.println(ofAllClass[i]);
                }
            }
        }



    }
}
