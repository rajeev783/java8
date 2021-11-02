package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		//stream min function
		Optional<Integer> min1 = numbers.stream()
				.reduce(Integer::min);
		System.out.println(min1.get());
		
		//ternary operater 
		
		Optional<Integer> min2 = numbers.stream()
				.reduce((a,b)-> a<b?a:b);
		System.out.println(min2.get());
		
		//Integer min function
				Optional<Integer> min3 = numbers.stream()
						.min(Integer::compareTo);
				System.out.println(min3.get());
		
	}

}
