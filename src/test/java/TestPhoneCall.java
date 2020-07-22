import org.junit.Assert;
import org.junit.Test;

public class TestPhoneCall {
    @Test
    public void test1() {
        int min1 = 3;
        int min2_10 = 1;
        int min11 = 2;
        int s = 20;
        int result = CommonTasks.phoneCall(min1, min2_10, min11, s);
        Assert.assertEquals(14, result);
    }

    @Test
    public void test2() {
        int min1 = 2;
        int min2_10 = 2;
        int min11 = 1;
        int s = 2;
        int result = CommonTasks.phoneCall(min1, min2_10, min11, s);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test3() {
        int min1 = 10;
        int min2_10 = 1;
        int min11 = 2;
        int s = 22;
        int result = CommonTasks.phoneCall(min1, min2_10, min11, s);
        Assert.assertEquals(11, result);
    }

    @Test
    public void test4() {
        int min1 = 2;
        int min2_10 = 2;
        int min11 = 1;
        int s = 24;
        int result = CommonTasks.phoneCall(min1, min2_10, min11, s);
        Assert.assertEquals(14, result);
    }

    @Test
    public void test5() {
        int min1 = 1;
        int min2_10 = 2;
        int min11 = 1;
        int s = 6;
        int result = CommonTasks.phoneCall(min1, min2_10, min11, s);
        Assert.assertEquals(3, result);
    }

}
