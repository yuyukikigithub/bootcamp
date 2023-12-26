import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> { // T is a part of class definition , and it can be bounded by 'extends ___' 
    // T can be all type
    // private T value;
    private List<T> values; // T can only be placed here

    public Printer(){
        this.values =  new ArrayList<>();
    }

    public Printer(T value){
        this.values =  new ArrayList<>();
        this.values.add(value);
    }
    
    public void add (T value){
        this.values.add(value);
    }
    public List<T> getValue(){
        return this.values;
    }

    public double sum(){
        double sum=0;
        for (T t : values) {
            sum+=t.doubleValue();
        }
        return sum;
    }
    
    @Override
    public String toString(){
        return "Printer("+this.values+")";
    }

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(10);
        // Printer<String> stringPrinter = new Printer<>("ab");
        Printer<Double> doublePrinter = new Printer<>(10.6);
        Printer<Double> doub = new Printer<>(10.2);
        doub.add(54.0);
        doub.add(23.9);
        doub.add(56.533);
        System.out.println(doub);
        List<Integer> in = new ArrayList<>();
        in.add(12);
        in.add(23);
        System.out.println(in);

        Bag.setThin("iammm");
        System.out.println(Bag.thin);


    }
}
