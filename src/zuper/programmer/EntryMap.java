package zuper.programmer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Mohammad", "Mohammad Value");
        map.put("Sirajul", "Sirajul Value");
        map.put("Umam", "Umam Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
