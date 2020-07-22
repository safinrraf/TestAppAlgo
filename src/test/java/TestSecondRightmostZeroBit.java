import org.junit.Assert;
import org.junit.Test;

public class TestSecondRightmostZeroBit {
    @Test
    public void test1() {
        final int n = 37;
        final int expectedOutput = 8;
        final int test = CommonTasks.secondRightmostZeroBit(n);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int n = 1073741824;
        final int expectedOutput = 2;
        final int test = CommonTasks.secondRightmostZeroBit(n);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int n = 83748;
        final int expectedOutput = 2;
        final int test = CommonTasks.secondRightmostZeroBit(n);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final int n = 728782938;
        final int expectedOutput = 4;
        final int test = CommonTasks.secondRightmostZeroBit(n);
        Assert.assertEquals(expectedOutput, test);
    }

}
