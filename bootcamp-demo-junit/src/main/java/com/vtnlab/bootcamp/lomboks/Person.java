package com.vtnlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// ==record
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Person {
    private String name;
    private int age;

    //specified constructor 自己寫
    public Person(String name){
        this.name=name;
    }
    public Person(int age){
        this.age=age;
    }

    public boolean isElderly(){
        return this.age>=65;
    }
    public static Person of(String name, int age){
        if (name == null || age<0) {
            return null;
        }
        return new Person(name,age);
    }
    public static String concat (String s1, String s2) {
        if (s1==null) {
            return s2;
        }
        if (s2==null) {
            return s1;
        }
        if (s1==null&& s2==null) {
            throw new IllegalArgumentException();
        }
        return s1.concat(s2);
    }
    // no need write getter setter
    // public String getName(){
    // }
    public static void main(String[] args) {
        Person person = new Person();
        // @Getter Setter
        person.setAge(30);
        person.setName("Peter");
        System.out.println(person.getName() + " "+person.getAge());
        //@AllArgsConstructor  @NoArgsConstructor
        Person person2=new Person("Mary",60);
        System.out.println(person2.getName() + " "+person2.getAge());

        Person person3 = new Person("John",50);
        //@ToString
        System.out.println(person2);
        System.out.println(person.equals(person3));
        System.out.println(person.hashCode());
        System.out.println(person3.hashCode());

        Person person4 = Person.builder()
            .name("steven")
            .age(44)
            .build();
        
        System.out.println(person4);

    }
}
