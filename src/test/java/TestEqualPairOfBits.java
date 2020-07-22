import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEqualPairOfBits {
    @Test
    public void test1() {
        final int n = 10;
        final int m = 11;
        final int expectedOutput = 2;
        final int test = CommonTasks.equalPairOfBits(n, m);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int n = 0;
        final int m = 0;
        final int expectedOutput = 1;
        final int test = CommonTasks.equalPairOfBits(n, m);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int n = 28;
        final int m = 27;
        final int expectedOutput = 8;
        final int test = CommonTasks.equalPairOfBits(n, m);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final int n = 1073741824;
        final int m = 1006895103;
        final int expectedOutput = 262144;
        final int test = CommonTasks.equalPairOfBits(n, m);
        assertEquals(expectedOutput, test);
    }

}
