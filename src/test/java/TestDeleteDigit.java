import org.junit.Assert;
import org.junit.Test;

public class TestDeleteDigit {
    @Test
    public void test1() {
        final int n = 152;
        final int expectedOutPut = 52;
        final int test = CommonTasks.deleteDigit(n);
        Assert.assertEquals(expectedOutPut, test);
    }

    @Test
    public void test2() {
        final int n = 1001;
        final int expectedOutPut = 101;
        final int test = CommonTasks.deleteDigit(n);
        Assert.assertEquals(expectedOutPut, test);
    }

    @Test
    public void test3() {
        final int n = 10;
        final int expectedOutPut = 1;
        final int test = CommonTasks.deleteDigit(n);
        Assert.assertEquals(expectedOutPut, test);
    }

    @Test
    public void test4() {
        final int n = 222219;
        final int expectedOutPut = 22229;
        final int test = CommonTasks.deleteDigit(n);
        Assert.assertEquals(expectedOutPut, test);
    }

    @Test
    public void test5() {
        final int n = 109;
        final int expectedOutPut = 19;
        final int test = CommonTasks.deleteDigit(n);
        Assert.assertEquals(expectedOutPut, test);
    }

    @Test
    public void test6() {
        final int n = 222250;
        final int expectedOutPut = 22250;
        final int test = CommonTasks.deleteDigit(n);
        Assert.assertEquals(expectedOutPut, test);
    }

}
