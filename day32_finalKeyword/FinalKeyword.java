package day32_finalKeyword;

import day24_dateAndTime.LocalDateIntro;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;


class CydeoStudent{

    public void language(){
        System.out.println("Java programming");
    }
}
public class FinalKeyword extends CydeoStudent {


    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender); // M

        //gender = 'F';

        System.out.println(gender); // F

        System.out.println("------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);


    }

}
