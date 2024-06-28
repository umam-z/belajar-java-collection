package zuper.programmer;

import java.util.Iterator;
import java.util.List;

public class ItarableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Mohammad", "Sirajul", "Umam");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("ITERATOR");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
