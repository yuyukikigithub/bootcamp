package trytrytry;

public class Piglet extends Pet implements FireFighting{
    
    private String name;
    private int age;

    public Piglet(String name, int age) {

        super(name, age);
       
    }

    @Override
    String makeSound() {
        return "gurd gurd !!";
    }

    

    public static void main(String[] args) {
        Pet p1 = new Piglet("piggy", 2);
        System.out.println(p1.makeSound());
    }

    @Override
    public void pullWater() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pullWater'");
    }

    @Override
    void sleep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }
}
