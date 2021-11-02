package streams;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class FilterExample {

	public static void main(String[] args) {
		
		List<Instructor> instructorList = Instructors.getAll().stream()
		.filter(s -> s.getYearsOfExperience() > 5)
		.collect(Collectors.toList());
		
		instructorList.forEach(System.out::println);
	}
}
