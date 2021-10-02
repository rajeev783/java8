package FunctionalProgramming;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String[] args) {
        Function<List<Instructor>, Map<String, Integer>> inst =(instructors -> {
            Map<String, Integer> instructorMap = new HashMap<String, Integer>();
            instructors.forEach(
                    instructor -> {
                        instructorMap.put(instructor.getName(),instructor.getYearsOfExperience());
                    });
                return instructorMap;
                });
        List<Instructor> instructorList = Instructors.getAll();
        System.out.println(inst.apply(instructorList));
    }
}
