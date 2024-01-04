import java.math.BigDecimal;
import java.util.Optional;

public class Account {
    private double balance;

    private int accountNo;
    // cannot directly interact with database
    // Optional is not suitable for Class attribute
    // Optional does not support serialization /deserialization natually
    // private Optional<String> currency; 
    

    public Account(int accountNo, double balance){
        this.balance=balance;
        this.accountNo=accountNo;
    }


    
    public double getBalance(){
        return this.balance;
    }
    public int getAccountNo(){
        return this.accountNo;
    }

    public void credit(double amount){
        this.balance+=amount;
    }
    public boolean debit(double amount) {
        if (amount>this.balance) return false;
        this.balance-=amount; // BigDecimal do calculation
        return true;
    }
    @Override
    public String toString(){
        return "Account(No: "+this.accountNo+", Balance: "+this.balance+")";
    }
   
    public static void main(String[] args) {
        BigDecimal sd = new BigDecimal(566.6);
        BigDecimal ds = new BigDecimal(567.6);
        System.out.println(sd.add(ds).doubleValue());

   

    }
}
