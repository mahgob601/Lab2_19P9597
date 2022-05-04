import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class MaxMinTest {

    MaxMin tester;
    @BeforeEach
    public void before()
    {
        tester = new MaxMin();
    }

    @Test
    public void findMinMaxCase1()
    {
        double[] testArr1 = {1,2,3,4,5,100,6,8,10,-1,0};
        tester.initArray(testArr1);
        assertEquals("Max: 100 ,Min: -1",tester.findMinMax());

    }

    @Test
    public void findMinMaxCase2()
    {
        double[] testArr2 = {1,2,3,4,5,409.9,6,8,10,-500.89};
        tester.initArray(testArr2);
        assertEquals("Max: 409.9 ,Min: -500.89",tester.findMinMax());

    }

    @Test
    public void findMinMaxEmptyArray()
    {
        double[] testArr3 = {};
        tester.initArray(testArr3);
        assertEquals("Error: Empty array",tester.findMinMax());

    }

    @AfterEach
    public void after()
    {
        tester = null;
    }

}