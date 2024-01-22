package com.vtnlab.bootcamp.lomboks;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)
public class Cat {
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude // only this field is exclued
    private double weight;
    @Getter
    private String name;
    @Getter
    @ToString.Include
    private int age;

    public static void main(String[] args) {
        Cat cat = new Cat(3.2,"ABC",3);
        System.out.println(cat.getWeight()+" "+cat.getName());
        cat.setWeight(3.8);

        Cat cat2 = new Cat(2.1,"ABC",3);
        System.out.println(cat.equals(cat2));

        System.out.println(cat);

    }

}
