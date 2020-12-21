package stringPrograms;

import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) {
        String str = "Training Training course and certification course in Devlabs Alliance";
        String[] split = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < split.length - 1; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count + 1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}