package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        Consumer<Instructor> c1 = (s) -> System.out.println(s);
        instructors.forEach(c1);

        System.out.println("------------------------------------------------------------");
        Consumer<Instructor> c2 = (s) -> System.out.print(s.getName());
        instructors.forEach(c2);

        System.out.println("------------------------------------------------------------");
        Consumer<Instructor> c3 = (s) -> System.out.println(s.getCourses());
        instructors.forEach(c2.andThen(c3));
    }
}
