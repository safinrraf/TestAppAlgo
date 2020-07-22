import org.junit.Assert;
import org.junit.Test;

public class TestCommonTasks {
    @Test
    public void test_1() {
        Assert.assertEquals(9, CommonTasks.largestNumber(1));
    }

    @Test
    public void test_2() {
        final int i = CommonTasks.largestNumber(2);
        Assert.assertEquals(99, CommonTasks.largestNumber(2));
    }

    @Test
    public void test_3() {
        final int i = CommonTasks.largestNumber(3);
        Assert.assertEquals(999, i);
    }

    @Test
    public void test_4() {
        final String str = "var_1__Int";
        Assert.assertTrue(CommonTasks.variableName(str));
    }

    @Test
    public void test_5() {
        final String str = "qq-q";
        Assert.assertFalse(CommonTasks.variableName(str));
    }

    @Test
    public void test_6() {
        final String str = "2w2";
        Assert.assertFalse(CommonTasks.variableName(str));
    }

    @Test
    public void test_7() {
        final String str = " variable";
        Assert.assertFalse(CommonTasks.variableName(str));
    }

    @Test
    public void test_8() {
        final String str = "va[riable0";
        Assert.assertFalse(CommonTasks.variableName(str));
    }

    @Test
    public void test_9() {
        final String str = "variable0";
        Assert.assertTrue(CommonTasks.variableName(str));
    }

    @Test
    public void test_10() {
        final String str = "a";
        Assert.assertTrue(CommonTasks.variableName(str));
    }

    @Test
    public void test_11() {
        final String str = "_Aas_23";
        Assert.assertTrue(CommonTasks.variableName(str));
    }

    @Test
    public void test_12() {
        final String str = "a a_2";
        Assert.assertFalse(CommonTasks.variableName(str));
    }

    @Test
    public void test_13() {
        final String str = "0ss";
        Assert.assertFalse(CommonTasks.variableName(str));
    }

}
