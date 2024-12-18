package CollectionFramework.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a1", "Rajat");
        map.put("a2", "Deepali");
        map.put("a3", "Rajdeep");
        map.put("a9", "Rajdeep");

        // for(String key: map.keySet()){
        // System.out.println("Key : "+key+" value : "+map.get(key));
        // }
        // System.out.println(map);
        // for(Map.Entry<String,String> entry : map.entrySet()){
        // System.out.println("Key: "+entry.getKey()+"value : "+entry.getValue());
        // }

        // using iterator
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> temp = entryIterator.next();
            System.out.println("Key: " + temp.getKey() + "value : " + temp.getValue());

        }
    }
}
