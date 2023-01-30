package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample5 {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Jerry");
        map.put(2,"Marry");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
