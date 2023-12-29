package day14_forLoop;

public class warmUpTask1 {

    public static void main(String[] args) {

        System.out.println(combine("Ene","Ensar"));

    }

    public static String combine(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //check if the last letter of str1 is the same as the first letter of str2
        if(str1.length() > 0 && str2.length() > 0 && str1.charAt(str1.length() -1) == str2.charAt(0)){
            //if yes, return the combined string without duplicating the common character
            return str1 + str2.substring(1);
        }else {
            //if no common character, simply concatenate the two strings
            return str1 + str2;
        }
    }
}
