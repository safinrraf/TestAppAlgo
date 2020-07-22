import org.junit.Assert;
import org.junit.Test;

public class TestDigitDegree {
    @Test
    public void test1() {
        final int r = 5;
        final int test = CommonTasks.digitDegree(r);
        Assert.assertEquals(0, test);
    }

    @Test
    public void test2() {
        final int r = 100;
        final int test = CommonTasks.digitDegree(r);
        Assert.assertEquals(1, test);
    }

    @Test
    public void test3() {
        final int r = 91;
        final int test = CommonTasks.digitDegree(r);
        Assert.assertEquals(2, test);
    }

    @Test
    public void test4() {
        final int r = 99;
        final int test = CommonTasks.digitDegree(r);
        Assert.assertEquals(2, test);
    }

    @Test
    public void test5() {
        final int r = 1000000000;
        final int test = CommonTasks.digitDegree(r);
        Assert.assertEquals(1, test);
    }

    @Test
    public void test6() {
        final int r = 9;
        final int test = CommonTasks.digitDegree(r);
        Assert.assertEquals(0, test);
    }

}
