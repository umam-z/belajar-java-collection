package zuper.programmer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        // List<String> list = new LinkedList<>();
        List<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Sirajul");
        list.add("UMAM");

        list.set(2, "umam");
        list.remove(1);
        System.out.println(list.get(0));

        for (String string : list) {
            System.out.println(string);
        }
    }
}
