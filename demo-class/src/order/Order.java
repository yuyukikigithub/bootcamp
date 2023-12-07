package order;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {
    private int id;
    private LocalDate buyDate;
    // private double totalAmount; // not raw data
    private int status; // 0->pending, 1->completed
    private String customerId;
    private Item[] items;
    private static int orderNo = 0; // static, can be amended by public and related to all object of this class

    // public Order (int id,LocalDate buyDate, String customerId){
    // this.id=id;
    // this.buyDate=buyDate;
    // // this.totalAmount=totalAmount;
    // this.customerId=customerId;
    // this.items=new Item[0];
    // }
    public Order(LocalDate buyDate, String customerId) {
        // this.id=id;
        this.id = ++orderNo;
        this.buyDate = buyDate;
        // this.totalAmount=totalAmount;
        this.customerId = customerId;
        this.items = new Item[0];
    }

    // public void setTotalAmount(double amount){
    // this.totalAmount=amount;
    // }
    public void setStatus(int status) {// 0 or 1
        this.status = status;
    }

    public void setCustomerId(String cusId) {
        this.customerId = cusId;
    }

    public void addItems(Item item) {
        Item[] newItem = Arrays.copyOf(this.items, this.items.length + 1);
        newItem[this.items.length] = item;
        this.items = newItem;
    }

    public Item[] addItemsMethod(Item item) {
        Item[] newItem = Arrays.copyOf(this.items, this.items.length + 1);
        newItem[this.items.length] = item;
        this.items = newItem;
        return this.items;
    }

    public int getId() {
        return this.id;
    }

    public int getStatus() {
        return this.status;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public Item[] getItems() {
        return this.items;
    }

    public double totalAmount() {
        BigDecimal sum = BigDecimal.valueOf(0);
        // BigDecimal sum=new BigDecimal(0);
        for (int i = 0; i < this.items.length; i++) {
            sum = sum.add(BigDecimal.valueOf(this.items[i].totalItemAmount()));
        }
        return sum.doubleValue();
    }

    // public static double totalAmount(Item[] items){
    // }

    @Override // override read, not [Lorder.Order;@27716f4
    public String toString() {
        return "Order(id=" + this.id + ", buyDate=" + this.buyDate + ", totalAmount=" + this.totalAmount() + ")";
    }

    public static void main(String[] args) {

        Order o1 = new Order(LocalDate.of(2023, 10, 6), "654a");
        Item ii1 = new Item(10, 2, "bread");
        Item ii2 = new Item(15, 3, "Garden Cake");
        // o1.addItems(ii1);
        // o1.addItems(ii2);

        for (int i = 0; i < 3; i++) {
            o1.addItems(ii2);// pass by reference
        }

        System.out.println(Arrays.toString(o1.getItems()));
        System.out.println(o1.totalAmount());

        StringBuilder sb1 = new StringBuilder("ef");
        sb1.append("sd");

        Customer c1 = new Customer();
        c1.addOrder(o1);
        System.out.println(o1.totalAmount()); // not related to customer
        System.out.println(c1.getOrder(o1.id).totalAmount()); // related to customer

    }

}
