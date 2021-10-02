package FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();
        Predicate<Instructor> p1 = (i1)->i1.getYearsOfExperience() > 5;

        instructorList.forEach(
                instructor -> {
                    System.out.println(p1.test(instructor));
                    if (p1.test(instructor)){
                        System.out.println(instructor);
                    }
                }
        );
    }
}
