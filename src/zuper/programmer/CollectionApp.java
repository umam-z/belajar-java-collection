package zuper.programmer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        System.out.println("ADD");
        collection.add("Mohammad");
        collection.add("Sirajul");
        collection.add("Umam");
        collection.addAll(List.of("Zuper", "Programmer"));

        for (String name : collection) {
            System.out.println(name);
        }
        
        System.out.println("REMOVE");
        
        collection.remove("Sirajul");
        collection.removeAll(List.of("Zuper", "Programmer"));

        for (String name : collection) {
            System.out.println(name);
        }

        System.out.println(
            collection.contains("Mohammad")
        );

        System.out.println(
            collection.containsAll(List.of("Mohammad", "Sirajul"))
        );

        System.out.println(collection.size());

    }
}
