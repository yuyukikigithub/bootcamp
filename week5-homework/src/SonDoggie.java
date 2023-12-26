import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class SonDoggie extends FatherDog implements YoungDog{

    public SonDoggie() {
        super();
    }
    public SonDoggie(String string, LocalDate of, char c) {
        super(string, of, c);
    }


    @Override
    public void milkDiet() {
        System.out.println("Meals of baby dog should be milk");
    }

    @Override
    public void keepWarm() {
        System.out.println("Baby dog should be kept in warm environment");
    }

    public static void main(String[] args) {
        SonDoggie sd1 = new SonDoggie();
        sd1.setName("BabyDog1");
        sd1.setBirth(LocalDate.of(2023, 9, 10));
        sd1.setGender('F');
        SonDoggie sd2 = new SonDoggie("BabyDog2", LocalDate.of(2023, 11, 1), 'M');
        SonDoggie sd3 = new SonDoggie("BabyDog2", LocalDate.of(2023, 11, 10), 'F');

        
        System.out.println(sd1);
        System.out.println(sd2);
        System.out.println(sd3);
        List<SonDoggie> sdArr= new ArrayList<>();
        sdArr.add(sd1);
        sdArr.add(sd2);
        sdArr.add(sd3);
        System.out.println(sdArr);
        sd2.breath();
    }

}
