import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
    public static void main(String[] args) throws Exception {

        
        List<Student1> students = new ArrayList<>();
        students.add(new Student1(40,"John"));
        students.add(new Student1(80,"Peter"));
        students.add(new Student1(50, "John"));
        students.add(new Student1(90,"Tom"));
        System.out.println(students);
        // Comparable
        // Collections.sort(students);
        // System.out.println(students);

        // Comparator
        // Collections.sort(students, new SortByScore());
        
        // System.out.println(students);
        Collections.sort(students,new SortByName());
        System.out.println(students);

        List<List<String>> paths = new ArrayList<>();
        paths.add(List.of("London","New York"));
        paths.add(List.of("New York","Lima"));
        paths.add(List.of("Lima","Sao Paulo"));
        System.out.println(paths.get(paths.size()-1).get(1));
    }
}
