import java.util.Objects;

public class CatStream {
    //name
    //age
    String name;
    int age;


    public CatStream(String name,int age ){
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "CatStream(Name: "+this.name+", Age: "+this.age+")";
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof CatStream)) {
            return false;
        }
        CatStream cat = (CatStream) obj;
        return Objects.equals(cat.getAge(),this.age ) && Objects.equals(cat.getName(), this.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.age);
    }

    

}
