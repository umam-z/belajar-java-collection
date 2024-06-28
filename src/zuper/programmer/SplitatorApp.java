package zuper.programmer;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SplitatorApp {
    public static void main(String[] args) {
        List<String> list = List.of("Mohammad", "Sirajul", "Umam", "Zupers", "Programmer");

        Spliterator<String> spliterator = list.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        
        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
    }
}
