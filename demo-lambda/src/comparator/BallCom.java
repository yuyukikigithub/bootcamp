package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BallCom {
    int price;
    ColorCom color;

    public BallCom(int price, ColorCom color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return this.price;
    }

    public ColorCom getColor() {
        return this.color;
    }

    public String toString() {
        return "BallCom(price: " + this.price + ", color: " + this.color + ")";
    }

    public static void main(String[] args) {
        List<BallCom> balls = new ArrayList<>();
        balls.add(new BallCom(50, ColorCom.YELLOW));
        balls.add(new BallCom(51,ColorCom.RED));
        balls.add(new BallCom(52, ColorCom.BLUE));

        //Approach 1
        Collections.sort(balls,new SortByColor()); // SortByColor apart from compare, can have other method
        System.out.println(balls);

        Collections.sort(balls,new SortByPrice());
        System.out.println(balls);
    
        //Approach 2
        //Lambda expression 做以下兩件事
        //1. implementing the logic of the required method
        //2. new the object with that implementation
        
        Comparator<BallCom> SortByColor = (b1,b2)->{
            return b2.getColor().name().compareTo(b1.getColor().name());
        };
        Comparator<BallCom> SortByPrice = (b1,b2)->{
            return b2.getPrice()>b1.getPrice()?1:-1;
        }; 

        Comparator<BallCom> sortByColorAndThenPrice =
            SortByColor.thenComparing(SortByPrice);
        
        Collections.sort(balls, sortByColorAndThenPrice);
        System.out.println(balls);

        Collections.sort(balls,(b1,b2)->b2.getPrice()>b1.getPrice()?1:-1);

    }
}
