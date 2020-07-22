import org.junit.Assert;
import org.junit.Test;

public class TestCandies {

    @Test
    public void test1() {
        Assert.assertEquals(9, CommonTasks.candies(3, 10));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, CommonTasks.candies(1, 2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, CommonTasks.candies(10, 5));
    }

    @Test
    public void test4() {
        final int i = CommonTasks.candies(4, 4);
        Assert.assertEquals(4, i);
    }

    @Test
    public void test5() {
        Assert.assertEquals(12, CommonTasks.candies(4, 15));
    }

    @Test
    public void test6() {
        Assert.assertEquals(99, CommonTasks.candies(9, 100));
    }

    @Test
    public void test7() {
        Assert.assertEquals(0, CommonTasks.candies(8, 2));
    }

    @Test
    public void test8() {
        Assert.assertEquals(3, CommonTasks.candies(3, 3));
    }

    @Test
    public void test9() {
        Assert.assertEquals(7, CommonTasks.candies(7, 10));
    }

    @Test
    public void test10() {
        int i = CommonTasks.candies(3, 23);
        Assert.assertEquals(21, i);
    }
}
