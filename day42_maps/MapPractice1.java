package day42_maps;

import java.util.HashMap;
import java.util.*;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("----------------------------------------");

        //how many female & male employees in map
        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;

        for (String genderOfEmployee : employeeMap.values()) {
            if (genderOfEmployee.equalsIgnoreCase("M")){
                countMaleEmployees++;
            }else if (genderOfEmployee.equalsIgnoreCase("F")){
                countFemaleEmployees++;
            }else {
                System.err.println("Invalid gender");
                throw new RuntimeException();
            }

        }

        System.out.println("countFemaleEmployees = " + countFemaleEmployees);
        System.out.println("countMaleEmployees = " + countMaleEmployees);

        System.out.println("----------------------------------------------------");


        for (Map.Entry<String, String> eachFemaleEmployee : employeeMap.entrySet()) {
            if (eachFemaleEmployee.getValue().equalsIgnoreCase("F")){
                System.out.println(eachFemaleEmployee);
            }
        }
        System.out.println("countFemaleEmployees = " + countFemaleEmployees);


        System.out.println("----------------------------------------------------");

        //update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equalsIgnoreCase("M")){
                eachEntry.setValue("Male");
            }else if (eachEntry.getValue().equalsIgnoreCase("F")){
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);

    }
}
