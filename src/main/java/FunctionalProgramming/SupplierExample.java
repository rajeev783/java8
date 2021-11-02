package FunctionalProgramming;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> (int)(Math.random()*10000);
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
	}
}
