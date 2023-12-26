import java.time.LocalDate;

public interface DogDog {
    
    void setName(String name);
    void setBirth(LocalDate birth);
    void setGender(char gender);
    String getName();
    LocalDate getBirth();
    Gender getGender();
    
}
