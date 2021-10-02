package FunctionalProgramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (p1) -> p1 > 10;
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(5));

        System.out.println("-------------------------------------------");
        Predicate<Integer> predicate2 = (p2)-> p2%2==0;
        System.out.println(predicate2.test(20));
        System.out.println(predicate2.test(15));

        System.out.println("-------------------------------------------");
        System.out.println(predicate.and(predicate2).test(80));
        System.out.println(predicate.and(predicate2).test(4));
        System.out.println(predicate.and(predicate2).test(75));
        System.out.println(predicate.and(predicate2).test(5));

        System.out.println("-------------------------------------------");
        System.out.println(predicate.or(predicate2).test(8));

        System.out.println("-------------------------------------------");
        System.out.println(predicate.test(19));
    }
}
