package zuper.programmer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("first", "muhammad");
        
        Map<String, String> mutable = new HashMap<>();
        
        mutable.put("first", "Mohammad");
        mutable.put("mmiddle", "Sirajul");
        mutable.put("last", "Umam");
        
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
            "first", "Mohammad",
            "middle", "Sirajul",
            "last", "Umam"
        );

        map.put("add", "test");
    }
}
