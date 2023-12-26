import java.util.Comparator;

public class SortByName implements Comparator<Student1>{

    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s2.getName().compareTo(s1.getName())>0?1:-1;
    }
    
}
