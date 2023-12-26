import java.util.Comparator;

public class SortByScore implements Comparator<Student1>{

  
    @Override
    public int compare(Student1 s1,Student1 s2) {
        return s2.getScore()>s1.getScore()?-1:1;
    }
    
}
