package collectionFrameworkPrograms;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

    public static void iterateHashMap() {
        HashMap<Integer, String> map=new HashMap();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(4, "Four");

        for(Map.Entry<Integer, String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+ "- "+ entry.getValue());
        }

        System.out.println("--------");

        for(Integer i:map.keySet()) {
            System.out.println(i);
        }

        for(String k:map.values()) {
            System.out.println(k);
        }
    }
}
