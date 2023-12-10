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



}
