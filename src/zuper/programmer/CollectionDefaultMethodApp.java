package zuper.programmer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 10;
            }
        });
        System.out.println(numbers);

        // for (Integer integer : numbers) {
        //     System.out.println(integer);
        // }

        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer t) { System.out.println(t); };
        });

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t > 200;
            }
        });
        System.out.println(numbers);
    }
}
