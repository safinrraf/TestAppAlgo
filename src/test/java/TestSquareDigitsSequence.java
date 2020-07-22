import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSquareDigitsSequence {

    @Test
    public void test1() {
        final int a0 = 16;
        final int expectedOutput = 9;
        final int test = CommonTasks.squareDigitsSequence(a0);
        assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int a0 = 103;
        final int expectedOutput = 4;
        final int test = CommonTasks.squareDigitsSequence(a0);
        assertEquals(expectedOutput, test);
    }

}
