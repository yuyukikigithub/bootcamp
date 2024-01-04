package lambda;

public interface SuperConsumer<T,U,V> { // can be same/ different type 
    void accept(T t,U u,V v);
    
}
