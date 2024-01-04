package comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<BallCom>{

    @Override
    public int compare(BallCom o1, BallCom o2) {
        return o2.getPrice()>o1.getPrice()?1:-1;
    }
    
}
