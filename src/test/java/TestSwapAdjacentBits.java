import org.junit.Assert;
import org.junit.Test;

public class TestSwapAdjacentBits {
    @Test
    public void test1() {
        final int n = 13;
        final int expectedOutput = 14;
        final int test = CommonTasks.swapAdjacentBits(n);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int n = 74;
        final int expectedOutput = 133;
        final int test = CommonTasks.swapAdjacentBits(n);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int n = 1073741823;
        final int expectedOutput = 1073741823;
        final int test = CommonTasks.swapAdjacentBits(n);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test4() {
        final int n = 0;
        final int expectedOutput = 0;
        final int test = CommonTasks.swapAdjacentBits(n);
        Assert.assertEquals(expectedOutput, test);
    }
}
