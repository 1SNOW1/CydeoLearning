package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, Object> person1 = new TreeMap<>();
        person1.put("ID", "CO2");
        person1.put("Name", "Enes");
        person1.put("Age", 21);
        person1.put("Job_title", "GameDev");
        System.out.println(person1.size());
        System.out.println(person1.get("Name"));
       // person1.remove("Name");
       // System.out.println(person1.get("Name"));
        person1.replace("Name", "Jacob");
        System.out.println(person1.get("Name"));
        System.out.println(person1.containsKey("Name"));
        System.out.println(person1.containsValue("Enes"));
        System.out.println(person1.containsValue("Jacob"));
        System.out.println(person1.containsValue("jacob")); //false because its case-sensitive
        System.out.println(person1.keySet());
        System.out.println(person1.values());

    }
}
