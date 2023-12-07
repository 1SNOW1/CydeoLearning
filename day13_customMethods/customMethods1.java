package day13_customMethods;

public class customMethods1 {

    public static void main(String[] args) {

        ageGroup(21);


    }

    public static void ageGroup(int ageGroups){


        if(ageGroups < 21){
            System.out.println("You are a teenager");
        }else if(ageGroups >=21 && ageGroups <55){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are a senior");
        }

    }


}
