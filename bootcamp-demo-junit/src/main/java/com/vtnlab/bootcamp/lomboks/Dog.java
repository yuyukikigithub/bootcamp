package com.vtnlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// @RequiredArgsConstructor // it use with NonNull
@AllArgsConstructor
@ToString
public class Dog {
    
    private final String firstName = "Dolly"; // already final, cannot be amend, not here in constructor
    
    @NonNull // runtime cannot null
    private String lastName; 

    @NonNull
    private String color;

    public static void main(String[] args) {
        Dog dog = new Dog("Chan","red");
        System.out.println(dog);
        Dog dog1 = new Dog(null,null);
        System.out.println(dog1);
    }
}
