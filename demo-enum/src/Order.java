public class Order {
    private int id;
    private Status status;

    public Order(int id, Status status){
        this.id=id;
        this.status=status; // save status in heap memory
    }
    public Status getStatus(){
        return this.status; 
    }
    public static void main(String[] args) {
        Order o1 = new Order(1, Status.ORDERED); // Status.ORDERED in heap memory
        Order o2 = new Order(2,Status.SHIPPED);

        if (o1.getStatus()!=o2.getStatus()) {
            System.out.println("diff status");
        }
        if (o1.getStatus().getVal()!=o2.getStatus().getVal()) {
            System.out.println("diff status val");
        }
    }
}
