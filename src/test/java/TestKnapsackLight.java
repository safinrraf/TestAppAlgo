import org.junit.Assert;
import org.junit.Test;

public class TestKnapsackLight {

    @Test
    public void test1() {
        final int value1 = 10;
        final int weight1 = 5;
        final int value2 = 6;
        final int weight2 = 4;
        final int maxW = 8;
        final int expected = 10;
        final int test = CommonTasks.knapsackLight(value1, weight1, value2, weight2, maxW);
        Assert.assertEquals(expected, test);
    }

    @Test
    public void test2() {
        final int value1 = 10;
        final int weight1 = 5;
        final int value2 = 6;
        final int weight2 = 4;
        final int maxW = 9;
        final int expected = 16;
        final int test = CommonTasks.knapsackLight(value1, weight1, value2, weight2, maxW);
        Assert.assertEquals(expected, test);
    }

    @Test
    public void test3() {
        final int value1 = 5;
        final int weight1 = 3;
        final int value2 = 7;
        final int weight2 = 4;
        final int maxW = 6;
        final int expected = 7;
        final int test = CommonTasks.knapsackLight(value1, weight1, value2, weight2, maxW);
        Assert.assertEquals(expected, test);
    }

    @Test
    public void test4() {
        final int value1 = 10;
        final int weight1 = 2;
        final int value2 = 11;
        final int weight2 = 3;
        final int maxW = 1;
        final int expected = 0;
        final int test = CommonTasks.knapsackLight(value1, weight1, value2, weight2, maxW);
        Assert.assertEquals(expected, test);
    }

    @Test
    public void test5() {
        final int value1 = 15;
        final int weight1 = 2;
        final int value2 = 20;
        final int weight2 = 3;
        final int maxW = 2;
        final int expected = 15;
        final int test = CommonTasks.knapsackLight(value1, weight1, value2, weight2, maxW);
        Assert.assertEquals(expected, test);
    }
}
