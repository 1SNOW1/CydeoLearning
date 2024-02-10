package day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        //Iterate by the keys
        for (String eachKey : map.keySet()) {
            System.out.println(map);
        }




        System.out.println("------------------------------------------");

        //Iterating through the values
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }



        System.out.println("------------------------------------------");

        for (Integer value : map.values()) {
            if (!(value < 90000)){
                System.out.println(value);
            }

        }


        System.out.println("------------------------------------------");

        //Iterate the map by the entries

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }

    }

}
