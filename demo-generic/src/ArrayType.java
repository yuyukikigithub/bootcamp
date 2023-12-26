
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayType <T> {
    private T value;
    private List<T> valueArr;

    public ArrayType(){
        
    }
    public ArrayType(T value){
        this.value=value;
        this.valueArr=new ArrayList<>();
    }
    public T getValue(){
        return this.value;
    }
    @Override
    public String toString(){
        return "ArrayEle("+this.value+")";
    }
    @Override
    public boolean equals(Object ob){
        if (this==ob) {
            return true;
        }
        if (!(ob instanceof ArrayType)) {
            return false;
        }
        ArrayType<Object> arr = new ArrayType<>(ob);
        return Objects.equals(arr.getValue(), this.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.value);
    }

    public static void main(String[] args) {
        ArrayType<String> strAr = new ArrayType<String>("abcde");
        System.out.println(strAr);
    }
}
