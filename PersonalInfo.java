package day4_contatenation;

public class PersonalInfo {

    public static void main(String[] args) {

        String firstName = "First name = Enes";
        String lastName = "Last name = Orhan";
        String gender = "Gender = Male";
        String age = "Age = 21";
        String from = "From = Sweden";
        String favMusic = "Favorite music = Instrumentals";
        String favBook = "Favorite book = Quran";
        String favShow = "Favorite show = Dirilis Ertugrul";
        String favColor = "Favorite color = Black";
        String marriedStatus = "Married status = Single";

        System.out.println(firstName + "\n" + lastName + "\n" + gender + "\n" + age + "\n" + from + "\n" +  favMusic + "\n" + favBook + "\n" + favShow + "\n" + favColor + "\n" + marriedStatus);
    }
}

/*
So i did it a bit differently than Muhtar baba, my method is quite simple, and you can see it from above nothing special.
I assigned every var as a String and didnt try to involve all the other types of data.
This could obviously be done differently. Muhtar used the String type on most vars and to not type the datatype several times he chose to put a coma at the end instead of a semicolon
this made it possible to do another var of the same type without having to assign the datatype,
for instance --> "String illShowYou = look at this,
                         thisIsHowItsDone = perfect;
now what ive done is, ive assigned to variables with the datatype String without having to assign the datatype twice.
 */

/*
    1. create a class named PersonalInfo. and declare the variables with the appropriate for the followings:

                1. first name
                2. last name
                3. gender
                4. age
                5. from
                6. favorite music
                7. favorite book
                8. favorite show
                9. favorite color
                10. married status
 */


