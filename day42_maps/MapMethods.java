package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("CO2", "Josh");
        map.put("BO3", "Nora");
        map.put("AO2", "Khashayac");
        map.put("DO2", "Abdullah");
        map.put("AO3", "Tatiana");

        Map<String, String> employees = new TreeMap<>();
        employees.putAll(map);

        System.out.println(employees);

        System.out.println(map == employees);

        System.out.println(map.equals(employees));


    }
}
