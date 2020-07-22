import org.junit.Assert;
import org.junit.Test;

public class TestChessKnight {
    @Test
    public void test1() {
        final String cell = "a1";
        final int excpectedOutput = 2;
        final int test = CommonTasks.chessKnight(cell);
        Assert.assertEquals(excpectedOutput, test);
    }

    @Test
    public void test2() {
        final String cell = "c2";
        final int excpectedOutput = 6;
        final int test = CommonTasks.chessKnight(cell);
        Assert.assertEquals(excpectedOutput, test);
    }

    @Test
    public void test3() {
        final String cell = "d4";
        final int excpectedOutput = 8;
        final int test = CommonTasks.chessKnight(cell);
        Assert.assertEquals(excpectedOutput, test);
    }

    @Test
    public void test4() {
        final String cell = "g6";
        final int excpectedOutput = 6;
        final int test = CommonTasks.chessKnight(cell);
        Assert.assertEquals(excpectedOutput, test);
    }

    @Test
    public void test5() {
        final String cell = "a3";
        final int excpectedOutput = 4;
        final int test = CommonTasks.chessKnight(cell);
        Assert.assertEquals(excpectedOutput, test);
    }

    @Test
    public void test6() {
        final String cell = "b7";
        final int excpectedOutput = 4;
        final int test = CommonTasks.chessKnight(cell);
        Assert.assertEquals(excpectedOutput, test);
    }

    @Test
    public void test9() {
        final String cell = "g8";
        final int excpectedOutput = 3;
        final int test = CommonTasks.chessKnight(cell);
        Assert.assertEquals(excpectedOutput, test);
    }

}
