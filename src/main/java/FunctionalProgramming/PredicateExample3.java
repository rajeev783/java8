package FunctionalProgramming;

import java.util.function.IntPredicate;

public class PredicateExample3 {

    public static void main(String[] args) {
        IntPredicate i = (i1) -> i1 > 100;
        System.out.println(i.test(200));
        System.out.println(i.test(20));
    }
}
