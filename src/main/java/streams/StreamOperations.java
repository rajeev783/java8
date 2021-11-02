package streams;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class StreamOperations {
	
	public static void main(String[] args) {
		
		long courseCount = Instructors.getAll().stream()
		.map(Instructor::getCourses)
		.flatMap(List::stream)
		.count();
		
		System.out.println(courseCount);
		
		long distinctCourseCount = Instructors.getAll().stream()
				.map(Instructor::getCourses)
				.flatMap(List::stream)
				.distinct()
				.count();
				
				System.out.println(distinctCourseCount);
				
				List<String> sortedDistinctCourses = Instructors.getAll().stream()
						.map(Instructor::getCourses)
						.flatMap(List::stream)
						.distinct()
						.sorted()
						.collect(Collectors.toList());
						
						System.out.println(sortedDistinctCourses);
	}

}
