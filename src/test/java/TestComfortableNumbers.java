import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestComfortableNumbers {
    @Test
    public void test1() {
        final int l = 10;
        final int r = 12;
        final int expectedOutput = 2;
        final int test = CommonTasks.comfortableNumbers(l, r);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int l = 1;
        final int r = 9;
        final int expectedOutput = 20;
        final int test = CommonTasks.comfortableNumbers(l, r);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int l = 13;
        final int r = 13;
        final int expectedOutput = 0;
        final int test = CommonTasks.comfortableNumbers(l, r);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test4() {
        final int l = 12;
        final int r = 108;
        final int expectedOutput = 707;
        final int test = CommonTasks.comfortableNumbers(l, r);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final int l = 239;
        final int r = 777;
        final int expectedOutput = 6166;
        final int test = CommonTasks.comfortableNumbers(l, r);
        assertEquals(expectedOutput, test);
    }

}
