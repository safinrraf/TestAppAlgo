import org.junit.Assert;
import org.junit.Test;

public class TestMinimalJumper {
    @Test
    public void test_1() {
        final int[] arr = {5, 3, 6, 7, 9};
        Assert.assertEquals(4, MinimalJumper.avoidObstacles(arr));
    }

    @Test
    public void test_2() {
        final int[] arr = {2, 3};
        int i = MinimalJumper.avoidObstacles(arr);
        Assert.assertEquals(4, MinimalJumper.avoidObstacles(arr));
    }

    @Test
    public void test_3() {
        final int[] arr = {1, 4, 10, 6, 2};
        int i = MinimalJumper.avoidObstacles(arr);
        Assert.assertEquals(7, MinimalJumper.avoidObstacles(arr));
    }

    @Test
    public void test_4() {
        final int[] arr = {1000, 999};
        int i = MinimalJumper.avoidObstacles(arr);
        Assert.assertEquals(6, MinimalJumper.avoidObstacles(arr));
    }

    @Test
    public void test_5() {
        final int[] arr = {19, 32, 11, 23};
        int i = MinimalJumper.avoidObstacles(arr);
        Assert.assertEquals(3, MinimalJumper.avoidObstacles(arr));
    }

    @Test
    public void test_6() {
        final int[] arr = {5, 8, 9, 13, 14};
        Assert.assertEquals(6, MinimalJumper.avoidObstacles(arr));
    }
}
