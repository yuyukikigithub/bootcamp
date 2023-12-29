package father;

public class Father implements Driver{

    @Override
    public void drive() {
        System.out.println("father is driver");
    }

    public static void main(String[] args) {
        Driver driver = new Father();
        driver.drive();

        Driver driver2 = new Driver() {
            @Override
            public void drive() {
                System.out.println("anonymous driver is driving");
            }
        };
        driver2.drive();
    }
    
}
