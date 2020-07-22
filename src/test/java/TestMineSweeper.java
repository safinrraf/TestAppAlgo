import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestMineSweeper {
    @Test
    public void test_1() {
        final boolean[][] arr = {{true, false, false}
                               , {false, true, false}
                               , {false, false, false}};
        final int[][] test = MineSweeper.minesweeper(arr);
        final int[][] etalon = {{1, 2, 1},
                                {2, 1, 1},
                                {1, 1, 1}};
        Assert.assertTrue(Arrays.equals(test, etalon));
    }
    @Test
    public void test_2() {
        final boolean[][] arr = {{true, false, false}};
        final int[][] test = MineSweeper.minesweeper(arr);
        final int[][] etalon = {{0, 1, 0}};
        Assert.assertTrue(Arrays.equals(test, etalon));
    }

}
