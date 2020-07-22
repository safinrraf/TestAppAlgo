import org.junit.Assert;
import org.junit.Test;

public class TestExtraNumber {
    @Test
    public void test1() {
        final int a = 2;
        final int b = 7;
        final int c = 2;
        final int expectedOutput = 7;
        final int test = CommonTasks.extraNumber(a, b, c);
        Assert.assertEquals(expectedOutput, test);
    }
}
