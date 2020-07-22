import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPagesNumberingWithInk {

    @Test
    public void test1() {
        final int current = 1;
        final int numberOfDigits = 5;
        final int expectedOutput = 5;
        final int test = CommonTasks.pagesNumberingWithInk(current, numberOfDigits);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int current = 21;
        final int numberOfDigits = 5;
        final int expectedOutput = 22;
        final int test = CommonTasks.pagesNumberingWithInk(current, numberOfDigits);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int current = 8;
        final int numberOfDigits = 4;
        final int expectedOutput = 10;
        final int test = CommonTasks.pagesNumberingWithInk(current, numberOfDigits);
        assertEquals(expectedOutput, test);
    }

}
