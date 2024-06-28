package zuper.programmer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);

        // Tambah data
        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        // melakukkan pencarian menggunakan binary search
        Integer index = Collections.binarySearch(list, 333);
        System.out.println(index);

        // menggunakan comparator
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        // 
        Integer index2 = Collections.binarySearch(list, 333);
        System.out.println(index2);
    }
}
