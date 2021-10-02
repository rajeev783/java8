package FunctionalProgramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = (i1) -> System.out.println(i1*10);
        intConsumer.accept(8);

        LongConsumer longConsumer = (l1) -> System.out.println(l1*5);
        longConsumer.accept(20);

        DoubleConsumer doubleConsumer = (d1)-> System.out.println(d1*20);
        doubleConsumer.accept(2.5);
    }
}
