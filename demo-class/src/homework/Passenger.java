package homework;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Passenger {
    private String seatClass;
    private char gender;
    private int age;
    private boolean isMember;
    private boolean isFanFare;


    public Passenger(String seatClass, char gender, int age, boolean isMember, LocalDateTime purchaseTime) {
        this.seatClass = seatClass;
        this.gender = gender;
        this.age = age;
        this.isMember = isMember;
        this.isFanFare=FlightSchedule.isFanFare(purchaseTime);
    }

    public boolean getIsFanFare(){
        return this.isFanFare;
    }

    public String getSeatClass(){
        return this.seatClass;
    }

    public double ticketPrice(double classStandardPrice) {
        BigDecimal resultPrice = BigDecimal.valueOf(0);
        
        if (this.isFanFare) {
            resultPrice = BigDecimal.valueOf(classStandardPrice).multiply(BigDecimal.valueOf(0.8));
        } else {
            resultPrice = BigDecimal.valueOf(classStandardPrice);
        }

        if (this.isMember) {
            resultPrice = resultPrice.multiply(BigDecimal.valueOf(0.5));
        }
        
        return resultPrice.doubleValue();
    }

    public static void main(String[] args) {
        FlightSchedule.setFullStandardPrice(60000);
        FlightSchedule f1 = new FlightSchedule("A330", "CX000", "HKG","YVR",201);
        System.out.println(f1.getFullStandardPrice());
        FlightSchedule.setfanFareDayOfWeek("tuesday");
        FlightSchedule.setfanFareHour(16);
        System.out.println(f1.getFanFareHour());
        System.out.println(f1.getFanFareDayOfWeek());
        Passenger p1 = new Passenger("business", 'M', 30, false, LocalDateTime.of(2023, 12, 12, 16, 0, 0));
        Passenger p2 = new Passenger("economy", 'F', 30, false, LocalDateTime.of(2023, 12, 11, 16, 0, 0));
        System.out.println(p1.isFanFare);
        System.out.println(p2.isFanFare);
        f1.addPessenger(p1);
        f1.addPessenger(p2);
       
        System.out.println(f1.getTotalReceipt());
    }



}
