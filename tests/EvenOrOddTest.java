import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddTest {

    @Test
    public void evenOddEvenTest1()
    {
        EvenOrOdd tester1 = new EvenOrOdd();
        Assert.assertEquals("4 should give Even Number","Even Number", tester1.evenOdd(4));

    }

    @Test
    public void evenOddEvenTest2()
    {
        EvenOrOdd tester2 = new EvenOrOdd();
        Assert.assertEquals("20 should give Even Number","Even Number", tester2.evenOdd(20));

    }

    @Test
    public void evenOddOddTest1()
    {
        EvenOrOdd tester3 = new EvenOrOdd();
        Assert.assertEquals("5 should give Odd Number","Odd Number", tester3.evenOdd(5));

    }

    @Test
    public void evenOddOddTest2()
    {
        EvenOrOdd tester4 = new EvenOrOdd();
        Assert.assertEquals("37 should give Odd Number","Odd Number", tester4.evenOdd(37));

    }

    @Test
    public void evenOddEvenNonInteger()
    {
        EvenOrOdd tester5 = new EvenOrOdd();
        Assert.assertEquals("4.5 should give Error Not Integer","Error Not Integer", tester5.evenOdd(4.5));

    }
}