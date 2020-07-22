import org.junit.Assert;
import org.junit.Test;

public class TestGrowingPlant {
    @Test
    public void test1() {
        final int upSpeed = 100;
        final int downSpeed = 10;
        final int desiredHeight = 910;
        final int c = CommonTasks.growingPlant(upSpeed, downSpeed, desiredHeight);
        Assert.assertEquals(10, c);
    }

    @Test
    public void test2() {
        final int upSpeed = 10;
        final int downSpeed = 9;
        final int desiredHeight = 4;
        final int c = CommonTasks.growingPlant(upSpeed, downSpeed, desiredHeight);
        Assert.assertEquals(1, c);
    }

    @Test
    public void test3() {
        final int upSpeed = 5;
        final int downSpeed = 2;
        final int desiredHeight = 7;
        final int c = CommonTasks.growingPlant(upSpeed, downSpeed, desiredHeight);
        Assert.assertEquals(2, c);
    }

    @Test
    public void test4() {
        final int upSpeed = 7;
        final int downSpeed = 3;
        final int desiredHeight = 443;
        final int c = CommonTasks.growingPlant(upSpeed, downSpeed, desiredHeight);
        Assert.assertEquals(110, c);
    }

    @Test
    public void test5() {
        final int upSpeed = 6;
        final int downSpeed = 5;
        final int desiredHeight = 10;
        final int c = CommonTasks.growingPlant(upSpeed, downSpeed, desiredHeight);
        Assert.assertEquals(5, c);
    }
}
