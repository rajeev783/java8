package FunctionalProgramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (x,y) -> System.out.println("x = "+x+"; y = "+y);
        biConsumer.accept(7,8);
    }
}
