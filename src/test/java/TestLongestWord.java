import org.junit.Assert;
import org.junit.Test;

public class TestLongestWord {
    @Test
    public void test1() {
        final String text = "Ready, steady, go!";
        final String expectedOutput = "steady";
        final String test = CommonTasks.longestWord(text);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final String text = "Ready[[[, steady, go!";
        final String expectedOutput = "steady";
        final String test = CommonTasks.longestWord(text);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final String text = "ABCd";
        final String expectedOutput = "ABCd";
        final String test = CommonTasks.longestWord(text);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test4() {
        final String text = "To be or not to be";
        final String expectedOutput = "not";
        final String test = CommonTasks.longestWord(text);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final String text = "You are the best!!!!!!!!!!!! CodeFighter ever!";
        final String expectedOutput = "CodeFighter";
        final String test = CommonTasks.longestWord(text);
        Assert.assertEquals(expectedOutput, test);
    }

}
