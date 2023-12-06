package order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    //17 types (String, Wrapper class, Primitive)
    private Order[] orders;
    private String customerId;



    //constructor

    public Customer(){
        this.orders=new Order[0];
    }
    public Customer ( Order order) {
        this.orders=new Order[] {order};
    }
    public Customer(Order[] orders){
        this.orders=orders;
    }

    //getter
    public Order[] getOrders(){
       return this.orders;
    }  



    // modify order
    public boolean updateOrderAmount(int orderId, double orderAmount){
        for (int i = 0; i < this.orders.length; i++) {
            if (orders[i].getId()==orderId) {
                orders[i].setTotalAmount(orderAmount);
                return true;
            }
        }
        return false;
    }

    public void addOrder(Order order){
        Order[] newOrd =Arrays.copyOf(this.orders, this.orders.length+1);
        newOrd[newOrd.length-1]=order;
        this.orders=newOrd;
    }

    public void deleteOrder(Order order){
        Order[] delOrd =new Order[this.orders.length-1];
        int idx = 0;
        for (int i = 0; i < this.orders.length; i++) {
            if(this.orders[i]!=order){
                delOrd[idx++]=this.orders[i];
            } 
        }
        this.orders = delOrd;

    }

    public static void main(String[] args) {

        //new customer object
        //new some order object and put into the customer

        String cusId = "PO356";
        
        Order oo=new Order(0, LocalDate.of(2012, 12, 30), 3156.2,cusId);
        Customer customer=new Customer(oo);

        Order o1 = new Order(1,LocalDate.now(),101.00,cusId);
        o1.setCustomerId(null);
        customer.addOrder(o1);
        Order o2 = new Order(2, LocalDate.of(2023, 12, 5), 1203.0,cusId);
        customer.addOrder(o2);
        

        Order o3=new Order(3,LocalDate.of(2022, 11, 30), 1021.0,cusId);
        customer.addOrder(o3);

        Order o4=new Order(4,LocalDate.of(2022, 12, 31), 1212.3,cusId);
        customer.addOrder(o4);

        System.out.println(Arrays.toString(customer.getOrders()));

        customer.deleteOrder(o3);

        System.out.println(Arrays.toString(customer.getOrders()));



    }
}
