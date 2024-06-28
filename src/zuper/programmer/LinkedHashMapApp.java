package zuper.programmer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        
        map.put("first", "Mohammad");
        map.put("last", "Umam");
        map.put("middle", "Sirajul");

        Set<String> keys = map.keySet();

        for (String string : keys) {
            System.out.println(string);
        }
    }
}
