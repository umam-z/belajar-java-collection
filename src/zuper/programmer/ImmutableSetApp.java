package zuper.programmer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        /**
         * untuk membuat immutable set caranya ialah sama seperti sebelumya
         * yaitu dengan menggunakan method:
         */

        // emtySet()
        Set<String> emty = Collections.emptySet();

        // singleton()
        Set<Integer> one = Collections.singleton(1);

        // unmodifiableSet
        Set<String> mutable = new HashSet<>();
        mutable.add("Muhammad");
        mutable.add("Umam");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        // of();
        Set<Integer> set = Set.of( 1, 2, 3, 4, 5);
        // set.remove(1); ERROR
        // set.add(4); ERROR
    }
}
