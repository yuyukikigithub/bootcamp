public class Cat1 {

    private String name;
    private int age;

    public Cat1(){

    }

    public Cat1 (String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Cat1)) {
            return false;
        }
        Cat1 cat = (Cat1) obj;
        return cat.getAge()==this.getAge() && cat.getName().equals(this.name);
    }
}
