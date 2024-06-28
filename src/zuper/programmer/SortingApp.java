package zuper.programmer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Sirajul");
        list.add("Umam");
        list.add("Zuper");
        list.add("Programmer");
        Collections.sort(list);

        for (String string : list) {
            System.out.println(string);
        }

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, reverse);

        for (String string : list) {
            System.out.println(string);
        }
    }
}
