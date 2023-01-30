package org.example.map;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapExample1 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(2,"Tom");
        map.put(1,"Som");
        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
