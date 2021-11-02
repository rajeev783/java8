package FunctionalProgramming;

import java.util.function.UnaryOperator;

public class UnaryOperaterExample {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> unary = (i) -> i*10;
		System.out.println(unary.apply(100));
	}

}
