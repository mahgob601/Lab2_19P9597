import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinTest {

    @Test
    public void findMinMaxCase1()
    {
        double[] testArr1 = {1,2,3,4,5,100,6,8,10,-1,0};
        MaxMin tester1 = new MaxMin();
        Assert.assertEquals("Should give Max: 100 ,Min: -1","Max: 100 ,Min: -1",tester1.findMinMax(testArr1));

    }

    @Test
    public void findMinMaxCase2()
    {
        double[] testArr2 = {1,2,3,4,5,409.9,6,8,10,-500.89};
        MaxMin tester2 = new MaxMin();
        Assert.assertEquals("Should give Max: 409.9 ,Min: -500.89","Max: 409.9 ,Min: -500.89",tester2.findMinMax(testArr2));

    }

    @Test
    public void findMinMaxEmptyArray()
    {
        double[] testArr3 = {};
        MaxMin tester3 = new MaxMin();
        Assert.assertEquals("Should give Error: Empty array","Error: Empty array",tester3.findMinMax(testArr3));

    }
}