package day5_operators;

import org.w3c.dom.ls.LSOutput;

public class logicalOperators {

    /*
    %% / Logical AND --> will only return TRUE if both the expressions are TRUE (75% false)



     */
    public static void main(String[] args) {

        double salary = 20_000;
        int creditScore = 660;

        boolean eligibleForLoan = salary >= 30000 && creditScore >=650;

        System.out.println("eligibleForLoan = " + eligibleForLoan);

        System.out.println("------------------------------------------------------------");



        String answer = "no";
        
        boolean validAnswer = answer == "no" || answer == "maybe";

        System.out.println("validAnswer = " + validAnswer);

        System.out.println("--------------------------------------------------------------");

        char grade = 'B';
        char gradeNoPass = 'F';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E';
        boolean didNotPassTheExam = gradeNoPass == 'F' ;
//tried to do smt fun here just ignore it
        if (didNotPassTheExam){ didNotPassTheExam = true;
            System.out.println("Passed the exam");
        }
//fun ends here

            System.out.println("passedTheExam = " + passedTheExam);
            System.out.println("didNotPassTheExam = " + didNotPassTheExam);

    }

    
}
