package comparator;

import java.util.Comparator;

public class SortByColor implements Comparator<BallCom> {

    @Override
    public int compare(BallCom o1, BallCom o2) {
        return o2.getColor().name().compareTo(o1.getColor().name())>0?1:-1;
    }
    
}
