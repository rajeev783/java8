package streams;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class FlatMapExample {
	
	public static void main(String[] args) {
		List<String> instructorCourses = Instructors.getAll()
				.stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		System.out.println(instructorCourses);
	}

}
