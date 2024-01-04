package lambda;

public interface CommonConsumer<T> extends SuperConsumer<T,T,T> {
    // generic extend, can determine type of data

}

// public interface CommonConsumer<T> {
//     
//       void accept(T t,T t,T t)
// }