package zuper.programmer;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Mohammad", "Sirajul", "Umam", "Zuper", "Programmer"));
        
        NavigableSet<String> reversedNames = names.descendingSet();
        // NavigableSet<String> sirajul = names.headSet("Umam", false);
        NavigableSet<String> sirajul = names.tailSet("Sirajul", true);
        
        
        for (String string : sirajul) {
            System.out.println(string);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Ups"); Error

    }
}
