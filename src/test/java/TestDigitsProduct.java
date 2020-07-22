import org.junit.Assert;
import org.junit.Test;

public class TestDigitsProduct {
    @Test
    public void test1() {
        final int product = 12;
        final int expectedOutput = 26;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int product = 19;
        final int expectedOutput = -1;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int product = 450;
        final int expectedOutput = 2559;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
        public void test4() {
        final int product = 0;
        final int expectedOutput = 10;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final int product = 13;
        final int expectedOutput = -1;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test6() {
        final int product = 1;
        final int expectedOutput = 1;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test7() {
        final int product = 243;
        final int expectedOutput = 399;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test8() {
        final int product = 576;
        final int expectedOutput = 889;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test9() {
        final int product = 360;
        final int expectedOutput = 589;
        final int test = CommonTasks.digitsProduct(product);
        Assert.assertEquals(expectedOutput, test);
    }

}
