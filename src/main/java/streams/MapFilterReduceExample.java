package streams;

import java.util.Optional;

import FunctionalProgramming.Instructor;
import FunctionalProgramming.Instructors;

public class MapFilterReduceExample {
	public static void main(String[] args) {
	Optional<Integer> totalYoI =	 Instructors.getAll().stream()
			.filter(i -> i.getYearsOfExperience() > 5)
			.map(Instructor::getYearsOfExperience).reduce(Integer::sum);
	
	System.out.println(totalYoI.get());
	}

}
