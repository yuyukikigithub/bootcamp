public abstract class Animal { // abstract, to be parent, cannot be new
    private int age;

    public Animal(){
        
    }

    public Animal(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }


}
