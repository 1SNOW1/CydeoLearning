package day5_operators;

import javax.lang.model.SourceVersion;

public class relationalOperators {

    /*
    greater than operator / >
    greater than or equal / >=
    less than / <
    less than or equal / <=
    equal / ==
    not equal / !=

    All relational operators return Boolean --> Boolean returns are true/false
     */


    public static void main(String[] args) {

        int a = 200,
                b = 1000;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);


        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);


        //-------------------------------------------------


        int score = 60;

        boolean passed = score >= 60;

        System.out.println(passed);

        System.out.println("----------------------------------------------------");
        
        
        int age = 23;
        
        boolean ageIsEligible = age >= 22;

        System.out.println("ageIsEligible = " + ageIsEligible);

        System.out.println("--------------------------------------------------------");




    }
}
