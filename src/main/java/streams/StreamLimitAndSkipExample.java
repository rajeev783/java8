package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,12,3,4,5,6,7,8,9);
	
	List<Integer> limit5 = numbers.stream().limit(5).collect(Collectors.toList());
	System.out.println(limit5);
	
	List<Integer> skip5 = numbers.stream().skip(5).collect(Collectors.toList());
	System.out.println(skip5);
}
}
