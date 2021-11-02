package streams;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class MapExample {

	public static void main(String[] args) {
		List<String> instructorNames = Instructors.getAll()
				.stream()
				.map(Instructor::getName)
				.collect(Collectors.toList());
		System.out.println(instructorNames);
		
		instructorNames = Instructors.getAll()
				.stream()
				.map(Instructor::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(instructorNames);
	}
}
