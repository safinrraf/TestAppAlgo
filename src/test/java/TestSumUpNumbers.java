import org.junit.Assert;
import org.junit.Test;

public class TestSumUpNumbers {
    @Test
    public void test1() {
        final String inputString = "2 apples, 12 oranges";
        final int expectedOutput = 14;
        final int test = CommonTasks.sumUpNumbers(inputString);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final String inputString = "there are some (12) digits 5566 in this 770 string 239";
        final int expectedOutput = 6587;
        final int test = CommonTasks.sumUpNumbers(inputString);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test7() {
        final String inputString = "abc abc 4 abc 0 abc";
        final int expectedOutput = 4;
        final int test = CommonTasks.sumUpNumbers(inputString);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test8() {
        final String inputString = "abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -";
        final int expectedOutput = 98;
        final int test = CommonTasks.sumUpNumbers(inputString);
        Assert.assertEquals(expectedOutput, test);
    }

}
