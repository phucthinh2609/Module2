package Bai12_Map.studentList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Thinh", 23);
        hashMap.put("Vinh", 24);
        hashMap.put("Phu", 25);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

//        Set<String> keys = hashMap.keySet();
//        for(String key: keys){
//            System.out.println("Key "+key+": "+hashMap.get(key));
//        }

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Thinh", 23);
        linkedHashMap.put("Vinh", 24);
        linkedHashMap.put("Phu", 25);
        System.out.println("\nThe age for " + "Thinh is " + linkedHashMap.get("Thinh"));

    }
}
