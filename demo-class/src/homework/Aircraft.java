package homework;

public class Aircraft {

    private static String model;
    private String flightNo;
    private Passenger[] passengers;
    
    private String departure;
    private String destination;

    public static void setModel(String craftModel){
        model = craftModel;
    }



    public static void main(String[] args) {
        Aircraft.setModel("A330-900");
    }
}
