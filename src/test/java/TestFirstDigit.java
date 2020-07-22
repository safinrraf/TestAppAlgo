import org.junit.Assert;
import org.junit.Test;

public class TestFirstDigit {

    @Test
    public void test1() {
        final char c = CommonTasks.firstDigit("var_1__Int");
        Assert.assertEquals('1', c);
    }

    @Test
    public void test2() {
        final char c = CommonTasks.firstDigit("q2q-q");
        Assert.assertEquals('2', c);
    }

    @Test
    public void test3() {
        final char c = CommonTasks.firstDigit("0ss");
        Assert.assertEquals('0', c);
    }

    @Test
    public void test4() {
        final char c = CommonTasks.firstDigit("_Aas_23");
        Assert.assertEquals('2', c);
    }

    @Test
    public void test5() {
        final char c = CommonTasks.firstDigit("a a_933");
        Assert.assertEquals('9', c);
    }

    @Test
    public void test6() {
        final char c = CommonTasks.firstDigit("ok0");
        Assert.assertEquals('0', c);
    }
}
