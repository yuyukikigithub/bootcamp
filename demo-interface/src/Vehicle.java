public interface Vehicle { // vehicle is an abstract word
    //intrface is a contract with 100% abstract behaviors (abstract method)

    int x=10; // implicitly "public static final"

    // if a class implement an interface, it has to implement all its abstract methods
    // all or nothing 
    boolean start(); // implicitly "public abstract" method, similar to abstract method
    
    boolean stop();

    boolean accelerate();

    boolean brake();

    // after Java 8
    // default instance method, class可以開的method,可以唔開, backward compatability
    default boolean test(){
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Vehicle.x);
        // interface no instance variable, all vaarible is static final
    }

} 
