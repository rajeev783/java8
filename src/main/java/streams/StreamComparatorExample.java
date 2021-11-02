package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class StreamComparatorExample {

	public static void main(String[] args) {
		
	List<Instructor> instructorList =	Instructors.getAll()
		.stream()
		.sorted(Comparator.comparing(Instructor::getName).reversed())
		
		.collect(Collectors.toList());
	
	instructorList.forEach(System.out::println);
	}
}
