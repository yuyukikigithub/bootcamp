package order;

import java.math.BigDecimal;

public class Item {

    private double price;
    private int quantity;
    private String desc;

    public Item(double price, int quantity, String desc){
        this.price=price;
        this.quantity=quantity;
        this.desc=desc;
    }

    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String getDesc(){
        return this.desc;
    }
    public double totalItemAmount(){
        return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
    }

    public void setPrice(double newPrice){
        this.price=newPrice;
    }
    public void setQuantity(int newQuantity){
        this.quantity=newQuantity;
    }
    public void setDesc(String newDesc){
        this.desc=newDesc;
    }

    @Override
    public String toString(){
        return "Item(price="+this.price+", quantity="+this.quantity+", desc="+this.desc+")";
    }
    public static void main(String[] args) {
        
    }
}
