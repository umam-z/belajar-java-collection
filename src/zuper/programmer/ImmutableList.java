package zuper.programmer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        /**
         * Method untuk membuat immutable list:
         * 1. Collections.unmodifiableList(list)
         * 2. Collections.emtyList()
         * 3. Collections.singletonList(e)
         * 4. List.of( e . . . )
         */
        List<String> one = Collections.singletonList("Satu");
        List<String> emty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("test1");
        mutable.add("test2");
        List<String> immutableList = Collections.unmodifiableList(mutable);

        List<String> elmen = List.of("testing1", "testing2", "testing3");
        elmen.add("Testing");
    }
}
