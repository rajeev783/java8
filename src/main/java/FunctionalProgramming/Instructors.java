package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){
        Instructor instructor1=new Instructor("Rajeeev", 9, "Java Full Stack engineer", "M",
                Arrays.asList("HTML", "CSS", "Java Script", "Java"));
        Instructor instructor2=new Instructor("Rajeeev 2", 8, "Full Stack engineer", "M",
                Arrays.asList("HTML", "CSS", "Java Script", "Java","Angular"));

        Instructor instructor3=new Instructor("Rajeeev 3", 7, "Java engineer", "M",
                Arrays.asList("HTML", "CSS", "Java Script", "Java","Spring"));
        Instructor instructor4=new Instructor("Rajeeev 4", 6, "Java Backend engineer", "M",
                Arrays.asList("HTML", "CSS", "Java Script", "Java","Hibernate"));
        Instructor instructor5=new Instructor("Rajeeev 5", 5, "UI engineer", "M",
                Arrays.asList("HTML", "CSS", "Java Script", "Java","React"));
        Instructor instructor6=new Instructor("Rajeeev 6", 4, "UX Stack engineer", "M",
                Arrays.asList("HTML", "CSS", "Java Script", "Java","Mysql"));

        List<Instructor> instructors = Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5,instructor6);

        return instructors;
    }
}
