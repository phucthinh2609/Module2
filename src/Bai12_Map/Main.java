package Bai12_Map;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("Thinh", 11);
        customers.put("Vinh", 12);
        customers.put("Phu", 13);

        Set<String> keys = customers.keySet();
        for(String key: keys){
            System.out.println("Key "+ key + ": " + customers.get(key));
        }


    }
}
