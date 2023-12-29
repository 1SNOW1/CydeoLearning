package day8_ternary_switch;

import java.text.BreakIterator;

public class switchIntro {

    public static void main(String[] args) {


        char grade = 'A';

    /*
    A: Excellent
    B: great job
    C: good
    D: passed
    F: failed
     */

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Ooooh hello there :) Are you lost?");
        }
    }



}
