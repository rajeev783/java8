package streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
public static void main(String[] args) {
	
	//of
	Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7);
	stream.forEach(System.out::println);
	System.out.println("-------------------------------------");
	//iterated
	Stream<Integer> evenStream = Stream.iterate(0,i->i+2).limit(10);
	evenStream.forEach(System.out::println);
	System.out.println("-------------------------------------");
	//generate
	Stream<Integer> randomStream = Stream.generate(new Random()::nextInt).limit(20);
	randomStream.forEach(System.out::println);
}
}
