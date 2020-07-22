import org.junit.Assert;
import org.junit.Test;

public class TestBishopAndPawn {

    @Test
    public void test1() {
        final String bishop = "a1";
        final String pawn = "c3";
        final boolean actual = CommonTasks.bishopAndPawn(bishop, pawn);
        Assert.assertTrue(actual);
    }

    @Test
    public void test2() {
        final String bishop = "h1";
        final String pawn = "h3";
        final boolean actual = CommonTasks.bishopAndPawn(bishop, pawn);
        Assert.assertFalse(actual);
    }

    @Test
    public void test3() {
        final String bishop = "a5";
        final String pawn = "c3";
        final boolean actual = CommonTasks.bishopAndPawn(bishop, pawn);
        Assert.assertTrue(actual);
    }

    @Test
    public void test4() {
        final String bishop = "g1";
        final String pawn = "f3";
        final boolean actual = CommonTasks.bishopAndPawn(bishop, pawn);
        Assert.assertFalse(actual);
    }

}
