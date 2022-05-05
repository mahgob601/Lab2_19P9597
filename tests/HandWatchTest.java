import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;

import static org.junit.Assert.*;

class HandWatchTest
{
    HandWatch tester;

    @BeforeEach
    public void before()
    {
        tester = new HandWatch();
    }

    @Nested
    class ADUPTesting
    {
        @Test
        public void testmodifyADUP1()
        {
            String expected = "2002-1-1\n" + "0:0";
            assertEquals(expected,tester.modify("acaaaabb"));

        }

        @Test
        public void testmodifyADUP2()
        {
            String expected2 = "2001-5-4\n" + "3:2";
            assertEquals(expected2,tester.modify("aacbbabbbabbbabbbbababa"));

        }


    }
    @Nested
    class edgeTesting
    {
        @Test
        void testmodifyEdge()
        {
            String expected3 = "2001-2-2\n" + "1:1";
            assertEquals(expected3,tester.modify("aacbababababacdbdba"));
        }
    }

}