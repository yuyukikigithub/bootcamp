package trytrytry;

public abstract class Pet {
    private String name;
    private int age;

    public Pet( String name,int age ){
        this.name=name;
        this.age=age;
    }

    abstract String makeSound();

    abstract void sleep();

    public String eat(){
        return "I am eating";
    }

    public void sleeping(){
        System.out.println("im sleeping");
    }
    @Override
    public String toString(){
        return "Pet( "+this.name+", "+this.age+")";
    }

}
