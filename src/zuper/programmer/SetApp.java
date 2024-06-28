package zuper.programmer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("Mohammad");
        names.add("Sirajul");
        names.add("Umam");
        names.add("Mohammad");
        names.add("Sirajul");
        names.add("Umam");

        for (String string : names) {
            System.out.println(string);
        }
    }
}
