package org.example.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Corton");
        map.put(3, "Devit");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}