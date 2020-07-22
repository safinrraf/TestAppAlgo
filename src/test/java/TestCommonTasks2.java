import org.junit.Assert;
import org.junit.Test;

public class TestCommonTasks2 {

    @Test
    public void test1() {
        Assert.assertEquals("dsbaz", CommonTasks.alphabeticShift("crazy"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("bbbbcccdde", CommonTasks.alphabeticShift("aaaabbbccd"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("gvaaz", CommonTasks.alphabeticShift("fuzzy"));
    }

    @Test
    public void test4() {
        Assert.assertTrue(CommonTasks.chessBoardCellColor("A1", "C3"));
    }

    @Test
    public void test5() {
        Assert.assertFalse(CommonTasks.chessBoardCellColor("A1", "H3"));
    }

    @Test
    public void test6() {
        Assert.assertTrue(CommonTasks.chessBoardCellColor("G5", "E7"));
//        Assert.assertTrue(CommonTasks.chessBoardCellColor("E7", "G5"));
    }

    @Test
    public void test7() {
        Assert.assertEquals(14, CommonTasks.circleOfNumbers(18, 5));
    }

    @Test
    public void test8() {
        final int year = CommonTasks.depositProfit(100, 20, 170);
        Assert.assertEquals(3, year);
    }

    @Test
    public void test9() {
        final int year = CommonTasks.depositProfit(100, 1, 101);
        Assert.assertEquals(1, year);
    }

    @Test
    public void test10() {
        final int year = CommonTasks.depositProfit(1, 100, 64);
        Assert.assertEquals(6, year);
    }

    @Test
    public void test11() {
        final int year = CommonTasks.depositProfit(1, 1, 200);
        Assert.assertEquals(533, year);
    }

    @Test
    public void test12() {
        final int year = CommonTasks.depositProfit(1, 1, 100);
        Assert.assertEquals(463, year);
    }

}
