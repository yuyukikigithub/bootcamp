package bank;
import java.time.LocalDateTime;

public class Transaction { // entry
    private LocalDateTime timestamp;
    private int amount;
    private boolean isCredit;

    //String descriptoin
    //String from;
    private Transaction(LocalDateTime timestamp,boolean isCredit, int amount){
        this.timestamp=timestamp;
        this.amount=amount;
        this.isCredit=isCredit;
        
    }
    // from private to public
    public Transaction(boolean isCredit, int amount){
        this(LocalDateTime.now(), isCredit, amount);
    }
    public static Transaction now(boolean isCredit, int amount){
        return new Transaction(isCredit, amount);
    }
    public boolean isCredit(){
        return this.isCredit;
    }

    public int getAmount(){
        return this.amount;
    }

    @Override
    public String toString(){
        return "Transaction(time="+timestamp+",isCredit="+isCredit+",amount=)"+this.amount;
    }

    public static void main(String[] args) {
        
    }
}
