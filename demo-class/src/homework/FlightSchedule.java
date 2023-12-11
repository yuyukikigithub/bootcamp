package homework;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class FlightSchedule {
    // market background info
    private static double fullStandardPrice;
    private static DayOfWeek fanFareDayOfWeek;
    private static int fanFareHour;
    // flight info
    private String model;
    private String flightNo;
    private Passenger[] passengers;
    private String departure;
    private String destination;
    // for arrival 
    private int lengthOfFlightHour;
    private LocalDateTime departureTime;

    private static final String[] classType=new String[] {"business","primiumEconomy","economy"}; 

    public FlightSchedule(String model, String flightNo,String departure,String destination, int noOfPassenger){
        this.model=model;
        this.flightNo=flightNo;
        this.departure=departure;
        this.destination=destination;
        this.passengers=new Passenger[noOfPassenger];
    }

    public ZonedDateTime arrivalZonedTime(String departure, String destination, LocalDateTime departureTime,int lengthOfFlightHour){
        ZoneId departureId = ZoneId.of(departure);
        ZoneId destinationId=ZoneId.of(destination);
        ZonedDateTime departureOff = departureTime.atZone(departureId);
        ZonedDateTime result=departureOff.plusHours(lengthOfFlightHour).toLocalDateTime().atZone(destinationId);
        return result;
    }

    public static void setFullStandardPrice(double price){
        FlightSchedule.fullStandardPrice=price;
    }

    public static void setfanFareDayOfWeek(String weekDay){
        DayOfWeek day = DayOfWeek.valueOf(weekDay.toUpperCase());
        FlightSchedule.fanFareDayOfWeek=day;
    }
    public static void setfanFareHour(int hour){
        FlightSchedule.fanFareHour=hour;
    }

    public static boolean isFanFare(LocalDateTime purchaseTime){
        return (purchaseTime.getDayOfWeek()==fanFareDayOfWeek && purchaseTime.getHour()==fanFareHour);
    }

    public static double ticketClassStdPrice(Passenger psg){
        BigDecimal classStandardPrice=BigDecimal.valueOf(0);
        for (String type : FlightSchedule.classType) {
            if (psg.getSeatClass().equals(type)) {
                if (psg.getSeatClass().equals("business")) {
                    classStandardPrice=BigDecimal.valueOf(FlightSchedule.fullStandardPrice);
                } else if(psg.getSeatClass().equals("primiumEconomy")){
                    classStandardPrice=BigDecimal.valueOf(FlightSchedule.fullStandardPrice).multiply(BigDecimal.valueOf(0.55));
                }else if(psg.getSeatClass().equals("economy")){
                    classStandardPrice=BigDecimal.valueOf(FlightSchedule.fullStandardPrice).multiply(BigDecimal.valueOf(0.28));
                }
            }
        }
        return classStandardPrice.doubleValue();
    }



    public Passenger addPessenger(Passenger passenger) {
        Passenger[] psgArr = Arrays.copyOf(this.passengers, this.passengers.length+1);
        psgArr[this.passengers.length]=passenger;
        this.passengers=psgArr;
        return passenger;
    }

    public double getFullStandardPrice(){
        return fullStandardPrice;
    }
    public DayOfWeek getFanFareDayOfWeek(){
        return fanFareDayOfWeek;
    }
    public int getFanFareHour(){
        return fanFareHour;
    }

    public double getTotalReceipt(){
        Passenger[] passengers=this.passengers;
        BigDecimal result = BigDecimal.valueOf(0);
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i]!=null) {
                result = result.add(BigDecimal.valueOf(passengers[i].ticketPrice(FlightSchedule.ticketClassStdPrice(passengers[i]))));
            }
        }
        return result.doubleValue();
    }




    public static void main(String[] args) {
        FlightSchedule f1=new FlightSchedule("A380", "CX001", "HKG", "YVR",204);
        System.out.println(f1.arrivalZonedTime("Asia/Hong_Kong", "Canada/Pacific", LocalDateTime.of(2023, 11, 30, 14, 0, 0), 14));
        FlightSchedule.setfanFareDayOfWeek("tuesday");
        FlightSchedule.setfanFareHour(16);
        FlightSchedule.setFullStandardPrice(60000);
        Passenger p1=new Passenger("primiumEconomy", 'F', 30, false, LocalDateTime.of(2023, 12, 12, 16, 0, 0));
        Passenger p2=new Passenger("economy", 'M', 35, false, LocalDateTime.of(2023, 12, 12, 16, 0, 0));
        f1.addPessenger(p1);
        System.out.println(p2.getIsFanFare());
        f1.addPessenger(p2);
        System.out.println(f1.getTotalReceipt());
        Passenger p3 = new Passenger("economy",'M', 50, false, LocalDateTime.of(2023, 11, 20, 16, 0, 0));
        System.out.println(p3.getIsFanFare());
    }
}
