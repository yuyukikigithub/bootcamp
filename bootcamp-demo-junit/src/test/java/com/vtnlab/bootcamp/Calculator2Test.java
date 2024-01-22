package com.vtnlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.vtnlab.bootcamp.unittest.Calculator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class Calculator2Test {
    private int value;

    @BeforeAll
    void beforeAll(){
        this.value+=10000;
        System.out.println("PER_CLASS BeforeAll this.value: "+this.value);
    }
    // PER_CLASS BeforeAll this.value: 10000

    @BeforeEach
    void initialize(){
        this.value+=100;
        System.out.println("beforeEach: this.x= "+this.value);
    }

    @Test
    @Order(1)
    void testAdd(){
        this.value+=Calculator.add(2, 3);
        assertEquals(10105, this.value);
        System.out.println("testAdd: "+this.value);
    }
    @Test
    @Order(2)
    void testSubstract(){
        // this.value-=Calculator.substract(this.value, 10);// 10105-(10105-10)
        this.value=Calculator.substract(this.value, 3);
        assertEquals(10202, this.value);
        System.out.println("testSubstract: "+this.value);
    }
    @Test
    @Order(3)
    void testAdd1(){
        this.value+=50;
        System.out.println("testAdd1: "+this.value);
    }

    // public static void main(String[] args) {
    //     Calculator2Test calculator2 = new Calculator2Test();
    //     calculator2.testAdd();
    //     calculator2.testSubstract();
    // }
}
