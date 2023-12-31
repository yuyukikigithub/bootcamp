package extendInterface;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Student implements Exam{
    private String name;
    private int age;
    private int studyHour;
    private String[] syllabus;
    
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        this.studyHour=0;
        this.syllabus=new String[0];
    }

    public void setStudyHour(int hour){
        this.studyHour=hour;
    }
    public void addSyllabus(String subject){
        String[] newArr = Arrays.copyOf(this.syllabus, this.syllabus.length+1);
        newArr[this.syllabus.length]=subject;
        this.syllabus=newArr;
    }
    public void clearSyllabus(){
        this.syllabus=new String[0];
    }

    @Override
    public int studyHour() {
        return this.studyHour;
    }

    @Override
    public String[] syllabus() {
        return this.syllabus;
    }

    @Override
    public boolean isPassed() {
        return this.studyHour/2>this.syllabus.length;
    }
    public static void main(String[] args) {
        Student ss1=new Student("Mary", 12);
        ss1.setStudyHour(5);
        ss1.addSyllabus("Chinese");
        ss1.addSyllabus("English");
        ss1.addSyllabus("PureMath");
        System.out.println(ss1.isPassed());

        
        
    
    }
}
