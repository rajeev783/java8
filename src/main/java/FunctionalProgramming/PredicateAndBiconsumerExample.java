package FunctionalProgramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiconsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();

        Predicate<Instructor> p1 = (i) -> i.getGender().equals("M");
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 5;

        BiConsumer<String, List<String>> biConsumer = (name, courses) ->{
            System.out.println(" name = "+name+"; courses ="+courses);
        };

        instructorList.forEach(
                instructor -> {
                    if(p1.and(p2).test(instructor)){
                        biConsumer.accept(instructor.getName(),instructor.getCourses());
                    }
                }
        );
    }
}
