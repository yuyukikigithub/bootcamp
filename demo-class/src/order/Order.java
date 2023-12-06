package order;
import java.time.LocalDate;

public class Order {
    private int id;
    private LocalDate buyDate;
    private double totalAmount;
    private int status; // 0->pending, 1->completed
    private String customerId;

    public Order (int id,LocalDate buyDate,double totalAmount, String customerId){
        this.id=id;
        this.buyDate=buyDate;
        this.totalAmount=totalAmount;
        this.customerId=customerId;
    }

    public void setTotalAmount(double amount){
        this.totalAmount=amount;
    }
    public void setStatus(int status){// 0 or 1
        this.status=status;
    }
    public void setCustomerId(String cusId){
        this.customerId = cusId;
    }

    public int getId(){
        return this.id;
    }
    public int getStatus(){
        return this.status;
    }

    public String getCustomerId(){
        return this.customerId;
    }

    @Override // override read, not [Lorder.Order;@27716f4
    public String toString (){
        return "Order(id="+this.id+", buyDate="+this.buyDate+", totalAmount="+this.totalAmount+")";
    }

    public static void main(String[] args) {
        
        

       
    }
    

}
