package box;


// public class Test extends Box<String>{    // 萬能KEY to be extended , T should be defined
public class Test<T> extends Box<T>{  //or
    T t;
    
    public static void main(String[] args) {
        Test<String> test= new Test<>();
        String s=test.t;
    }
}
