package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

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

        Map<String, Object>[] arrayOfMap = new Map[2];
        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;

        for (Map<String, Object> each : arrayOfMap) {
            System.out.println(each);
        }

    }
}
