import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoLocalDate {
    public static void main(String[] args) {
        LocalDate date2 = LocalDate.of(1990, 10, 11);
        System.out.println(date2.toString());

        LocalDate date3=LocalDate.of(1997, 11, 7);
        if (date3.isAfter(date2)) {
            System.out.println("date3 is after date2");
        }else if (date3.equals(date2)) {
            System.out.println("date3 is the same as date2");
        }else {
            System.out.println("date3 is before date2");
        }

        System.out.println(date3.isLeapYear());

        System.out.println(date3.getMonthValue());

        LocalDate date4=LocalDate.of(1998, 12, 1);

        System.out.println(LocalDate.now());

        LocalDateTime date5=LocalDateTime.now();

        System.out.println(date5.getHour());


        int i1=4;
        int i2=4;
        System.out.println(i1==i2);

        Integer ii1=127;
        Integer ii2=127;
        System.out.println(ii1==ii2);// false

        byte b1=(byte) 4;
        byte b2=(byte) 4;
        System.out.println(b1==b2);
        
        
    }
}
