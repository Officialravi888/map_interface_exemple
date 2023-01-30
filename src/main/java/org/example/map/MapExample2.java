package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Tom");
        map.put(2,"som");
        map.put(3,"Jerry");
        for (Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
}
