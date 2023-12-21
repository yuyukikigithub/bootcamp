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
        Collections.sort(students);
        System.out.println(students);

        
    }
}
