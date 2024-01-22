package com.vtnlab.bootcamp;

// import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
// import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
public class App1Test 
{

    @Mock
    private App2 dependency;// not create object yet
    /**
     * Rigorous Test :-)
     */
    @Test
    void testAdd(){

        //if call dependency.provider(10,4) return -323
        Mockito.when(dependency.provider(10, 4)).thenReturn(-323);
    
        App1 app1 = new App1(dependency);

        int result = app1.add(5,4);

        assertEquals(677, result);
    }
}
