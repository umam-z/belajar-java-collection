package zuper.programmer;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("mohammad", "Mohammad");
        hashTable.put("sirajul", "Sirajul");
        hashTable.put("umam", "Umam");

        for (String string : hashTable.keySet()) {
            System.out.println(string);
        }
    }
}
