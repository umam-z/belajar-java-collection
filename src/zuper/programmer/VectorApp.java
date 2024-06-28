package zuper.programmer;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("Mohammad");
        list.add("Sirajul");
        list.add("Umam");

        for (String string : list) {
            System.out.println(string);
        }
    }
}
