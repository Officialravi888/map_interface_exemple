package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jordan");
        map.put(2, "som");
        map.put(3, "Marry");
//        map.put(1, "jerry");
//        map.put(2, "jerry");
//        map.put(3, "jerry");
        map.put(4, "jerry");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
