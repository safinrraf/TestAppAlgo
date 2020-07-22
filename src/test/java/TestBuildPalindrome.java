import org.junit.Assert;
import org.junit.Test;

public class TestBuildPalindrome {

    @Test
    public void test0() {
        final String st =     "q";
        final String etalon = "q";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test01() {
        final String st =     "qqqqw";
        final String etalon = "qqqqwqqqq";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test1() {
        final String st =     "abcdc";
        final String etalon = "abcdcba";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test2() {
        final String st =     "ababab";
        final String etalon = "abababa";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test3() {
        final String st =     "abba";
        final String etalon = "abba";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test4() {
        final String st =     "abaa";
        final String etalon = "abaaba";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test5() {
        final String st =     "aaaaba";
        final String etalon = "aaaabaaaa";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test6() {
        final String st =     "abc";
        final String etalon = "abcba";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test7() {
        final String st =     "kebab";
        final String etalon = "kebabek";
        final String test = CommonTasks.buildPalindrome(st);
        Assert.assertEquals(etalon, test);
    }

}
