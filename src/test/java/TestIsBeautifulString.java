import org.junit.Assert;
import org.junit.Test;

public class TestIsBeautifulString {

    @Test
    public void test1() {
        final String inputString = "bbbaacdafe";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertTrue(b);
    }

    @Test
    public void test2() {
        final String inputString = "aabbb";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertFalse(b);
    }

    @Test
    public void test3() {
        final String inputString = "bbc";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertFalse(b);
    }

    @Test
    public void test4() {
        final String inputString = "bbbaa";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertFalse(b);
    }

    @Test
    public void test5() {
        final String inputString = "abcdefghijklmnopqrstuvwxyzz";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertFalse(b);
    }

    @Test
    public void test6() {
        final String inputString = "abcdefghijklmnopqrstuvwxyz";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertTrue(b);
    }

    @Test
    public void test7() {
        final String inputString = "abcdefghijklmnopqrstuvwxyzqwertuiopasdfghjklxcvbnm";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertTrue(b);
    }

    @Test
    public void test8() {
        final String inputString = "fyudhrygiuhdfeis";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertFalse(b);
    }

    @Test
    public void test9() {
        final String inputString = "zaa";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertFalse(b);
    }

    @Test
    public void test10() {
        final String inputString = "zyy";
        final boolean b = CommonTasks.isBeautifulString(inputString);
        Assert.assertFalse(b);
    }
}
