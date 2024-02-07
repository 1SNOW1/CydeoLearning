package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("Name", "Arthur");
        person1.put("Gender", 'M');
        person1.put("Age", 32);
        person1.put("Job_title", "Developer");
        person1.put("Salary", 100000.5);
        person1.put("Married", true);

        System.out.println("person1 = " + person1);
        System.out.println(person1.get("Name"));
        System.out.println(person1.get("Age"));
    }
}
