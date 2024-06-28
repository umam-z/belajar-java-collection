package zuper.programmer;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("Mohammad", "Mohammad");
        map.put("Sirajul", "Sirajul");
        map.put("Umam", "Umam");

        for (String string : map.keySet()) {
            System.out.println(string);
        }

        // key yang kurang dari sirajul ()
        System.out.println(map.lowerKey("Sirajul"));
        System.out.println(map.higherKey("Sirajul"));
        // System.out.println(map.floorKey("Sirajul"));
        // System.out.println(map.ceilingKey("Sirajul"));

        NavigableMap<String, String> descMap = map.descendingMap();
        
        for (String string : descMap.keySet()) {
            System.out.println(string);
        }
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(descMap);

        immutable.put("Usman", "Usman");
    }
}
