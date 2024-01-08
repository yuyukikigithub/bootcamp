/**
 * Exercise: Create a Class with Generics Data Types T, U
 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * Expected Output:
 * T t = Venturenix Lab
 * U u = 10
 * T t = Venturenix Lab
 * U u = 12
 */
class Company {
  String name;

  Company(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

// Exercise: Create a Class with Generics Data Types T, U
// 2 fields, company and noOfStaff
// with get methods and constructor
// Implement a print() method to generate the expected outputs

class Generics<T, U> {
  private T t;
  private U u;
  public Generics(T t, U u){
    this.t=t;
    this.u=u;
  }
  public T getCompany(){
    return t;
  }
  public U getNoOfStaff(){
    return u;
  }
  public static <T, U> void print(T t, U u){
    System.out.println("T t = "+t);
    System.out.println("U u = "+u);
  }
}

// Driver class to test above
class Exercise30 {

  public static void main(String[] args) {
    Generics<String, Integer> generic = new Generics<>("Venturenix Lab", 10);
    Generics.print(generic.getCompany(), generic.getNoOfStaff());

    Generics<Company, String> generic2 = new Generics<>(new Company("Venturenix Lab"), "12");
    Generics.print(generic2.getCompany().getName(), generic2.getNoOfStaff());

    Map<String, Integer> pair = new HashMap<>();
    pair.put("peter", 10);
    BiFunction<Integer, Integer, Integer> com = (a,b)->a*b;
    System.out.println(pair.merge("mary", 20, com));

    
    
  }
}
