package FunctionalProgramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n*n;

        System.out.println(" Square of 5 is : "+square.apply(5));
    }
}
