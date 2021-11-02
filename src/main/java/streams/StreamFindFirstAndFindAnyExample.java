package streams;

import java.util.Arrays;
import java.util.List;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class StreamFindFirstAndFindAnyExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,12,3,4,5,6,7,8,9);
		
		Instructor firstInstructor = Instructors.getAll().stream().findFirst().get();
		System.out.println(firstInstructor);
		
		Instructor anyInstructor = Instructors.getAll().stream().findAny().get();
		System.out.println(anyInstructor);
	}
}
