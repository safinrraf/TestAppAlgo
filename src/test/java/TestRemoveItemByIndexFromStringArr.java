import org.junit.Assert;
import org.junit.Test;

public class TestRemoveItemByIndexFromStringArr {

    @Test
    public void test1() {
        final String[] arrSrc =    {"000", "111", "222", "333"};
        final String[] arrEtalon = {"000", "111",        "333"};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 2);
        Assert.assertArrayEquals(arrEtalon, test);
    }

    @Test
    public void test2() {
        final String[] arrSrc =    {"000", "111", "222", "333"};
        final String[] arrEtalon = {       "111", "222", "333"};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 0);
        Assert.assertArrayEquals(arrEtalon, test);
    }

    @Test
    public void test3() {
        final String[] arrSrc =    {"000", "111", "222", "333"};
        final String[] arrEtalon = {"000", "111", "222"};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 3);
        Assert.assertArrayEquals(arrEtalon, test);
    }

    @Test
    public void test4() {
        final String[] arrSrc =    {"000"};
        final String[] arrEtalon = {};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 0);
        Assert.assertArrayEquals(arrEtalon, test);
    }

    @Test
    public void test5() {
        final String[] arrSrc =    {"000", "111", "222", "333", "444", "555"};
        final String[] arrEtalon = {"000", "111", "222", "333"       , "555"};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 4);
        Assert.assertArrayEquals(arrEtalon, test);
    }

    @Test
    public void test6() {
        final String[] arrSrc =    {"000", "111", "222", "333", "444", "555"};
        final String[] arrEtalon = {"000",        "222", "333", "444", "555"};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 1);
        Assert.assertArrayEquals(arrEtalon, test);
    }

    @Test
    public void test7() {
        final String[] arrSrc =    {"000", "111"};
        final String[] arrEtalon = {"000"};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 1);
        Assert.assertArrayEquals(arrEtalon, test);
    }

    @Test
    public void test8() {
        final String[] arrSrc =    {"000", "111"};
        final String[] arrEtalon = {"111"};
        final String[] test = CommonTasks.removeItemByIndexFromStringArr(arrSrc, 0);
        Assert.assertArrayEquals(arrEtalon, test);
    }

}
