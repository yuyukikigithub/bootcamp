public class DogStream {
    private int age;
    public String name;

    public DogStream(int age ){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "DogStream(Age: "+this.age+")";
    }
}
