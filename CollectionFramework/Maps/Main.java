package CollectionFramework.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); 
        map.put("a1", "Rajat");
        map.put("a2","Deepali");
        map.put("a3","Rajdeep");
        map.put("a9","Rajdeep");
        System.out.println(map);
    }
}
