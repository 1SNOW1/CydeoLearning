package day42_maps;

import javax.management.ObjectName;
import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("Name", "Arthur");
        person1.put("Gender", 'M');
        person1.put("Age", 32);
        person1.put("Job_title", "Developer");
        person1.put("Salary", 100000.5);
        person1.put("Hired_date", LocalDate.of(2021, 1, 15));
        person1.put("Married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("Name", "Nora");
        person2.put("Gender", 'F');
        person2.put("Age", 32);
        person2.put("Job_title", "Back-end Developer");
        person2.put("Salary", 150_000);
        person2.put("Hired_date", LocalDate.of(2022, 8, 15));
        person2.put("Married", true);

        //the following code is called list of map
        List<Map<String, Object>> listOfEmployees = new ArrayList<>(Arrays.asList(person1,person2));

        System.out.println("---------------------------------------------------------------------");

        for (Map<String, Object> each : listOfEmployees) {
            System.out.println(each);
            for (Map.Entry<String, Object> eachEntry : each.entrySet()) {
                System.out.println(eachEntry);
            }
        }

        System.out.println("---------------------------------------------------------------------");
        //display the names of the employee who are hired this year (2022)

        for (Map<String, Object> eachMap : listOfEmployees) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("Hired_date")){
                    if (((LocalDate)eachEntry.getValue()).getYear() == 2022){
                        System.out.println(eachMap.get("Name"));
                    }
                }
            }
        }



        System.out.println("---------------------------------------------------------------------");

        listOfEmployees.get(1).replace("Name", "Enes");
        listOfEmployees.get(1).replace("Gender", "M");
        System.out.println(listOfEmployees.get(1));


        System.out.println("---------------------------------------------------------------------");

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("Brand", "BMW");
        car1.put("Model", "X5");
        car1.put("Year", 2021);
        car1.put("Color", "Red");
        car1.put("Price", 45000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();
        car2.put("Brand", "BMW");
        car2.put("Model", "X5");
        car2.put("Year", 2021);
        car2.put("Color", "Red");
        car2.put("Price", 45000.5);

        Map<String, Object> car3 = new LinkedHashMap<>();

        Map<String, Object> car4 = new LinkedHashMap<>();

        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3,car4));

        System.out.println(cars);


    }
}
