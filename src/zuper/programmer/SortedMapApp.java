package zuper.programmer;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        SortedMap<String, String> sortedMap = new TreeMap<>(comparator);
        sortedMap.put("Mohammad", "Mohammad");
        sortedMap.put("Sirajul", "Sirajul");
        sortedMap.put("Umam", "Umam");
        
        for (String string : sortedMap.keySet()) {
            System.out.println(string);
        }
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
        // immutable.put("Usman", "Usman");
    }
}
