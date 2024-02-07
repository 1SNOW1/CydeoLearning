package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        System.out.println("hashMap = " + hashMap);

        System.out.println("----------------------------------------------------");
        
        
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        
        System.out.println("----------------------------------------------------");


        Map<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);

        System.out.println("hashtable = " + hashtable);

        System.out.println("----------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);

        System.out.println("treeMap = " + treeMap);
    }
}
