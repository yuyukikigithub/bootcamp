import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FatherDog extends Animal implements DogDog, Comparable<FatherDog>{

    private String name;
    private LocalDate birth;
    private Gender gender;

    public FatherDog(){
        
    }
    public FatherDog(String name, LocalDate birth, Gender gender){
        this.name=name;
        this.birth=birth;
        this.gender=gender;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setBirth(LocalDate birth){
        this.birth=birth;
    }
    @Override
    public void setGender(char gender) {
        this.gender=Gender.fromGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirth() {
        return this.birth;
    }

    public Gender getGender() {
        return this.gender;
    }
    @Override
    public String toString(){
        return "FatherDog(Name: "+this.name+", Birth: "+this.birth+", Gender: "+this.gender+")";
    }

    @Override
    public int compareTo(FatherDog sd) {
        if (sd.getName().compareTo(this.name) > 0) {
            return 1;
        } else if (sd.getName().compareTo(this.name) == 0) {
            if (sd.getBirth().isAfter(this.birth)) {
                return 1;
            } else {
                return -1;
            }
        }
        return -1;

    }

    @Override
    public boolean equals(Object ob) {
        if (ob == this) {
            return true;
        }
        if (!(ob instanceof FatherDog)) {
            return false;
        }
        FatherDog fatherDog = (FatherDog) ob;
        return Objects.equals(fatherDog.getName(), this.name) && Objects.equals(fatherDog.getBirth(), this.birth)
                && Objects.equals(fatherDog.getGender(), this.gender);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.birth, this.gender);
    }

    
    @Override
    void breath() {
        System.out.println("I am breathing");
    }
    @Override
    void heartBeat() {
        System.out.println("Heart is beating");
    }

    
    public static void main(String[] args) {
        FatherDog fd1=new FatherDog("FatherDog1",LocalDate.of(2023, 10, 11),Gender.MALE);
        System.out.println(fd1);
        fd1.breath();
        FatherDog fd2=new FatherDog("FatherDog2",LocalDate.of(2023, 10, 13),Gender.FEMALE);
        FatherDog fd3=new FatherDog("FatherDog1",LocalDate.of(2023, 10, 10),Gender.MALE);
        
        List<FatherDog> fdArr=new ArrayList<>();
        fdArr.add(fd1);
        fdArr.add(fd2);
        fdArr.add(fd3);
        Collections.sort(fdArr);
        System.out.println(fdArr);
        System.out.println(fd3.getGender());

    }
}
