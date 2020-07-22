import org.junit.Assert;
import org.junit.Test;

public class TestIsDigit {
    @Test
    public void test1() {
        boolean b = CommonTasks.isDigit('1');
        Assert.assertTrue(CommonTasks.isDigit('1'));
    }

}
