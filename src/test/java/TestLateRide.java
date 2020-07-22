import org.junit.Assert;
import org.junit.Test;

public class TestLateRide {
    @Test
    public void test1() {
        final int i = 240;
        final int j = CommonTasks.lateRide(i);
        Assert.assertEquals(4, j);
    }

    @Test
    public void test2() {
        final int i = 808;
        final int j = CommonTasks.lateRide(i);
        Assert.assertEquals(14, j);
    }

    @Test
    public void test3() {
        final int i = 1439;
        final int j = CommonTasks.lateRide(i);
        Assert.assertEquals(19, j);
    }

    @Test
    public void test4() {
        final int i = 0;
        final int j = CommonTasks.lateRide(i);
        Assert.assertEquals(0, j);
    }

    @Test
    public void test5() {
        final int i = 23;
        final int j = CommonTasks.lateRide(i);
        Assert.assertEquals(5, j);
    }

    @Test
    public void test6() {
        final int i = 8;
        final int j = CommonTasks.lateRide(i);
        Assert.assertEquals(8, j);
    }
}
