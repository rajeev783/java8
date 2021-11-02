package FunctionalProgramming;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> bo = (a,b) -> a+b;
		System.out.println(bo.apply(10, 20));
	}
}
