import org.junit.Assert;
import org.junit.Test;

public class TestIsMAC48Address {
    @Test
    public void test1() {
        final String inputString = "00-1B-63-84-45-E6";
        Assert.assertTrue(CommonTasks.isMAC48Address(inputString));
    }
}
