package FunctionalProgramming;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();
        Predicate<Instructor> p1 = (i) -> i.getYearsOfExperience() > 5;
        Predicate<Instructor> p2 = (i) -> i.getGender() == "M";

        BiPredicate<Integer,String> biPredicate = (experience, gender) -> experience > 5 && gender == "M";
        instructorList.forEach(
                instructor -> {
                   if( biPredicate.test(instructor.getYearsOfExperience(),instructor.getGender()))
                   {
                       System.out.println(" if ----- "+instructor.toString());
                   }else {
                       System.out.println(" else ----"+instructor.toString());
                   }
                }
        );
    }
}
