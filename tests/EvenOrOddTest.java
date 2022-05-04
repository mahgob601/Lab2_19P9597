import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import static org.junit.Assert.*;

public class EvenOrOddTest {

    EvenOrOdd tester;

    @BeforeEach
    public void before()
    {
        tester = new EvenOrOdd();
    }

    @Nested
    class EvenTesting
    {
        @Test
        public void evenOddEvenTest1()
        {
            EvenOrOdd tester1 = new EvenOrOdd();
            Assert.assertEquals("Even Number", tester1.evenOdd(4));

        }

        @Test
        public void evenOddEvenTest2()
        {
            EvenOrOdd tester2 = new EvenOrOdd();
            Assert.assertEquals("Even Number", tester2.evenOdd(20));

        }

    }


    @Nested
    class OddTesting
    {
        @Test
        public void evenOddOddTest1()
        {

            assertEquals("Odd Number", tester.evenOdd(5));

        }

        @Test
        public void evenOddOddTest2()
        {
            assertEquals("Odd Number", tester.evenOdd(37));

        }

    }



    @Test
    public void evenOddEvenNonInteger()
    {
        assertEquals("4.5 should give Error Not Integer","Error Not Integer", tester.evenOdd(4.5));

    }

    @AfterEach
    public void after()
    {
        tester = null;
    }

}