package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class StreamExample {
	
	public static void main(String[] args) {
		Predicate<Instructor> p1 = (i) -> i.getGender() == "M";
		Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 5;
		
		Map<String, List<String>> map = Instructors.getAll()
				.stream()
				.filter(p1)
				.filter(p2)
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(map);
		
	}

}
