public class Taxi implements Vehicle{ // class signature 

    private int speed;
    private int capacity;
    public static final int MAX_SPEED=100;
    

    public Taxi(int speed){
        this.speed=speed;
    }
    private Taxi(int speed, int capacity){

    }
    public static Taxi small(){
        return new Taxi(0,4);
    }
    public static Taxi big(){
        return new Taxi(0,5);
    }
    // set MAX_SPEED

    //getter
    public int getSpeed(){
        return this.speed;
    }
    public int getCapacity(){
        return this.capacity;
    }
    //setter
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public boolean isOn(){
        return this.speed>0;
    }
    public boolean isStopped(){
        return this.speed<=0;
    }
    public boolean isOverMaxSpeed(){
        return this.speed>Taxi.MAX_SPEED;
    }

    @Override // let the compiler validate the relationship of inheritance
    public boolean start() {
        if (this.isOn()) {
            return false;
        }
        this.speed=10;
        return true;
    }

    @Override
    public boolean stop() {
        if (this.isStopped()) {
            return false;
        }
        this.speed=0;
        return true;
        // this.speed=0;
    }

    @Override
    public boolean accelerate() {
        if (this.isStopped()) {
            return false;
        }
        this.speed+=10;      
        if (this.isOverMaxSpeed()) {
            this.speed=Taxi.MAX_SPEED;
        }
        return true;
    }

    @Override
    public boolean brake() {
        if (this.isStopped()) {
            return false;
        }
        this.speed-=10;
        return true;
    }
    public static void main(String[] args) {
        Taxi t1 = Taxi.small();
        t1.start();
        t1.accelerate();
        t1.stop();

        System.out.println(Vehicle.x);
    }
    
}
