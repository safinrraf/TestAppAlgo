import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDifferentRightmostBit {
    @Test
    public void test1() {
        final int n = 11;
        final int m = 13;
        final int expectedOutput = 2;
        final int test = CommonTasks.differentRightmostBit(n, m);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int n = 7;
        final int m = 23;
        final int expectedOutput = 16;
        final int test = CommonTasks.differentRightmostBit(n, m);
        assertEquals(expectedOutput, test);
    }

}
