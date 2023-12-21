public class Student1 implements Comparable<Student1>{
    
    private int score;
    private String name;

    public Student1(int score,String name){
        this.score=score;
        this.name=name;
    }
    public int getScore(){
        return this.score;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Student1 s) { // for sorting in Collection
        // return s.getScore()>this.score?-1:1; // ?1:-1 大到細
        if (s.getName().compareTo(this.name)>0) {
            return 1;
        }else if(s.getName().compareTo(name)==0){
            if (s.getScore()>this.score) {
             return 1;   
            }else{
                return -1;
            }
        }else {
            return -1;
        }
    }
    @Override
    public String toString(){
        return "Student("+this.score+", "+this.name+")";
    }
}
