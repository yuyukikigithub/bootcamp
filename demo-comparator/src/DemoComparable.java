import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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

        Set<String> sset=new HashSet<>();
        sset.add("Alice");
        sset.add("Bob");
        sset.add("Charles");
        sset.add("Bob");
        System.out.println(sset);
        
    }
}
