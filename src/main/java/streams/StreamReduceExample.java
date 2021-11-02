package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,12,3,4,5,6,7,8,9);
		int sumResult = numbers.stream()
				.reduce(0, (a,b)->a+b);
		System.out.println(sumResult);
		
		int multiplicationResult = numbers.stream()
				.reduce(1, (a,b)->a*b);
		System.out.println(multiplicationResult);
		
		Optional<Integer> optionalSum = numbers.stream()
				.reduce((a,b)-> a+b);
		System.out.println("Optional Sum = "+optionalSum.get());
		
		/*Optional<Integer> optionalMax = numbers.stream()
				.reduce((a,b)-> {
					if(a > b) return a;
					else return b;
				});*/
		Optional<Integer> optionalMax = numbers.stream()
				.reduce((a,b)->  a>b ?a:b);
		System.out.println("Max = "+optionalMax.get());
	}

}
