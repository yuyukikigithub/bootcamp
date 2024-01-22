package com.vtnlab.bootcamp;

// import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*; // 當自己method

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
// import static com.vtnlab.bootcamp.unittest.DemoStaticImport.*;
// junit5 --> org.junit.jupiter
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.vtnlab.bootcamp.lomboks.Order;
import com.vtnlab.bootcamp.lomboks.Person;
import com.vtnlab.bootcamp.unittest.Calculator;

// @TestInstance(TestInstance.Lifecycle.PER_METHOD) // default setting
public class CalculatorTest {

    private int sub=10;
    private static int z=10;

    @BeforeAll // before all test case
    static void beforeAll(){ // must be static
        z+=10;
        System.out.println("beforeall z= "+z);
    }
    // meaning of BeforeEach == BeforeAll
    @BeforeEach
    void initialize(){
        this.sub+=100;
        System.out.println("beforeEach: this.x= "+this.sub);
    }

    // beforeall z= 20
    // beforeEach: this.x= 100
    // 101
    // beforeEach: this.x= 100
    // 101


    // public static void assertEquals(int x, int u){ 先用自己果個

    // }
    // no need public for test case
    @Test // maven trigger this method during "test" phase
    void testAdd(){
        int actualResult = Calculator.add(5, 3);
        int expectResult = 8;
        // Assertions.assertEquals(expectResult, actualResult);
        assertEquals(expectResult, actualResult); // 當自己method
        // Assertions.assertNotEquals(getClass(), Calculator.add(7, 3));
        assertNotEquals(21, Calculator.add(7, 3));

        Person person = new Person("Sally",65);
        assertTrue(person.isElderly());
        assertTrue(new Person("Sally",65).isElderly());
        // assertFalse(new Person("Sally",65).isElderly());

        // assertSame(getClass(), getClass());
        // assertNotSame(getClass(), getClass());
        // assertNull
        assertNull(Person.of("John",-1));
        assertNull(Person.of(null,30));
        // assertNotNull
        assertNotNull(Person.of("John",40));
        // assertArrayEquals
        
        // assertSame
        String s1 = "hello";
        String s2 = "hello";
        assertSame(s1, s2);//check if they are same object
        // assertNotSame
        String s3 = new String("hello");
        assertNotSame(s2, s3);   //check if they are same object 
        
        Person x1 = new Person("Jason",30);
        Person x2 = new Person("Jason",30);
        assertNotSame(x1, x2); // they are not same
        assertEquals(x1, x2); // but they are equal
        // assertThrows
        // assertThrows(IllegalArgumentException.class, ()->Person.concat(null, null));
        // assertDoesNotThrow
        assertDoesNotThrow( ()->Person.concat("con", "cat"));
        assertDoesNotThrow( ()->Person.concat(null, "cat"));
        assertDoesNotThrow( ()->Person.concat("con", null));
        // assertAll // all event should be happened
        Order order = new Order();
        assertAll(
            ()->assertTrue(order.order()),
            ()->assertTrue(order.payment()),
            ()->assertTrue(order.lockInventory())
        );
        // assertTimeout, try runtime, or try connection time
        List<String> items=new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            items.add(String.valueOf(i));
        }
        assertTimeout(Duration.ofMillis(100), 
            ()->order.placeOrder(items)
        );
        sub++;
        System.out.println(this.sub);
    }

    @Test // interact with maven
    void testOther(){
        assertTrue(5>3);
        sub++;
        System.out.println(this.sub);
    }

    public static void main(String[] args) {
        // by default, the unit testing wil be performed by instance and instance method
        // each method create new object
        // vs 
        // PER_CLASS
        // one object for testing all method in the class
        CalculatorTest calculator1 = new CalculatorTest();
        calculator1.testAdd();
        System.out.println(calculator1.sub);
        CalculatorTest calculator2 = new CalculatorTest();
        calculator2.testOther();
        System.out.println(calculator2.sub);
    }
    
}
