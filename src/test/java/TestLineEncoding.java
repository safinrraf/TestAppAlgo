import org.junit.Assert;
import org.junit.Test;

public class TestLineEncoding {
    @Test
    public void test1() {
        final String s = "aabbbc";
        final String expectedOutput = "2a3bc";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final String s = "abbcabb";
        final String expectedOutput = "a2bca2b";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final String s = "abcd";
        final String expectedOutput = "abcd";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test4() {
        final String s = "zzzz";
        final String expectedOutput = "4z";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final String s = "wwwwwwwawwwwwww";
        final String expectedOutput = "7wa7w";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test6() {
        final String s = "ccccccccccccccc";
        final String expectedOutput = "15c";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test7() {
        final String s = "qwertyuioplkjhg";
        final String expectedOutput = "qwertyuioplkjhg";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test8() {
        final String s = "ssiiggkooo";
        final String expectedOutput = "2s2i2gk3o";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test9() {
        final String s = "adfaaa";
        final String expectedOutput = "adf3a";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test10() {
        final String s = "bbjaadlkjdl";
        final String expectedOutput = "2bj2adlkjdl";
        final String test = CommonTasks.lineEncoding(s);
        Assert.assertEquals(expectedOutput, test);
    }

}
