package ConsumerPackage;

import java.util.function.*;

public class ConsumerExample {
    public static void main(String[] args) {
        //Consumer
        Consumer<String> c1 = x -> System.out.println(x);
        c1.accept("java");   // java
        Consumer<String> c2 = x -> System.out.println(x);
        c2.accept("Programming");

        IntConsumer i1=i-> System.out.println(i);
        i1.accept(100);
        LongConsumer l1 = l-> System.out.println(l);
        l1.accept(123L);
        DoubleConsumer d1 = d-> System.out.println(d);
        d1.accept(12.34);

        //Double Consumenr
        BiConsumer<String,String> biConsumer1 = (x, y)-> System.out.println(x+" and "+y);
        biConsumer1.accept("one","two");

    }
}
