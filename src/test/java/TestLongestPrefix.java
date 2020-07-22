import org.junit.Assert;
import org.junit.Test;

public class TestLongestPrefix {
    @Test
    public void test1() {
        final String str = CommonTasks.longestDigitsPrefix("123aa1");
        Assert.assertEquals("123", str);
    }

    @Test
    public void test2() {
        final String str = CommonTasks.longestDigitsPrefix("0123456789");
        Assert.assertEquals("0123456789", str);
    }

    @Test
    public void test3() {
        final String str = CommonTasks.longestDigitsPrefix("  3) always check for whitespaces");
        Assert.assertEquals("", str);
    }

    @Test
    public void test4() {
        final String str = CommonTasks.longestDigitsPrefix("12abc34");
        Assert.assertEquals("12", str);
    }

    @Test
    public void test5() {
        final String str = CommonTasks.longestDigitsPrefix("the output is 42");
        Assert.assertEquals("", str);
    }

    @Test
    public void test6() {
        final String str = CommonTasks.longestDigitsPrefix("aaaaaaa");
        Assert.assertEquals("", str);
    }

}
