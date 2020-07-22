import org.junit.Assert;
import org.junit.Test;

public class TestCommonTask3 {
    @Test
    public void test1() {
        final int[] a = {2, 4, 7};
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(4, v);
    }

    @Test
    public void test2() {
        final int[] a = {2, 3};
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(2, v);
    }

    @Test
    public void test3() {
        final int[] a = {1, 1, 3, 4};
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(1, v);
    }

    @Test
    public void test4() {
        final int[] a = {23};
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(23, v);
    }

    @Test
    public void test5() {
        final int[] a = {-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(15, v);
    }

    @Test
    public void test6() {
        final int[] a = {-4, -1};
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(-4, v);
    }

    @Test
    public void test7() {
        final int[] a = {0, 7, 9};
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(7, v);
    }

    @Test
    public void test8() {
        final int[] a = {
                -10,
                100,
                200,
                300,
                400,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500,
                500
        };
        final int v = CommonTasks.absoluteValuesSumMinimization(a);
        Assert.assertEquals(500, v);
    }

}
