package order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    //17 types (String, Wrapper class, Primitive)
    private Order[] orders;
    private String customerId;
    private int age;


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

    public Order getOrder(int orderId){
        for (int i = 0; i < this.orders.length; i++) {
            if (orderId==this.orders[i].getId()) {
                return this.orders[i];
            }
        }
        return null;// null -> no object return
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    // modify order
    // public boolean updateOrderAmount(int orderId, double orderAmount){
    //     for (int i = 0; i < this.orders.length; i++) {
    //         if (orders[i].getId()==orderId) {
    //             orders[i].setTotalAmount(orderAmount);
    //             return true;
    //         }
    //     }
    //     return false;
    // }

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
    public boolean deleteOrder(int orderId){

        boolean[] found=new boolean[this.orders.length];

        Order[] delOrd =new Order[this.orders.length-1];
        int idx = 0;
        for (int i = 0; i < this.orders.length; i++) {
            if(this.orders[i].getId()!=orderId){
                delOrd[idx++]=this.orders[i];
                found[i]=true;
            } 
            found[i]=false;
        }
        this.orders = delOrd;
            
        for (boolean f : found) {
            if(!f) return false;
        }
        return true;
        
    }

    public boolean isAdult(){
        return this.age>=18;
    }
    public boolean isVIP(){
        return this.orders.length>=100;
    }
    public char membership(){
        if (this.orders.length>=100) {
            return 'G';
        }else if (this.orders.length>=50) {
            return 'S';
        }
        return 'N';
    }

    public static int orderNo;

    public static void main(String[] args) {

        //new customer object
        //new some order object and put into the customer

        String cusId = "PO356";
        
        Order oo=new Order(LocalDate.of(2012, 12, 30),cusId);
        Item ii1 =new Item(45, 2, "GODIVA Chocolate");
        Item ii2=new Item(99.5,2,"Scallope");
        oo.addItems(ii1);
        oo.addItems(ii2);
        Customer customer=new Customer(oo);

        Order o1 = new Order(LocalDate.now(),cusId);
        customer.addOrder(o1);
        Order o2 = new Order( LocalDate.of(2023, 12, 5),cusId);
        customer.addOrder(o2);
        

        Order o3=new Order(LocalDate.of(2022, 11, 30),cusId);
        customer.addOrder(o3);

        Order o4=new Order(LocalDate.of(2022, 12, 31),cusId);
        customer.addOrder(o4);
        o4.addItems(ii2);

        System.out.println(Arrays.toString(customer.getOrders()));

        customer.deleteOrder(o3.getId());

        System.out.println(Arrays.toString(customer.getOrders()));

        System.out.println(customer.getOrder(o4.getId()).totalAmount());

        customer.setAge(18);
        System.out.println(customer.isAdult());
        System.out.println(customer.isVIP());

    }
}
