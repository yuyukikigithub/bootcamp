public class Bus implements Vehicle {

    private int speed;
    private int capacity;
    public static final int MAX_SPEED=100;

    @Override
    public boolean test(){
        return true;
    }

    public Bus(int speed){
        this.speed=speed;
    }
    private Bus(int speed, int capacity){

    }
    public static Bus small(){
        return new Bus(0,4);
    }
    public static Bus big(){
        return new Bus(0,5);
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
        return this.speed>Bus.MAX_SPEED;
    }
    @Override
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
}
