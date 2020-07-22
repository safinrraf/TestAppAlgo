import org.junit.Assert;
import org.junit.Test;

public class TestDifferentSquares {
    @Test
    public void test1() {
        final int[][] matrix =
                {{1, 2, 1},
                        {2, 2, 2},
                        {2, 2, 2},
                        {1, 2, 3},
                        {2, 2, 1}};
        final int expectedOutput = 6;
        final int test = CommonTasks.differentSquares(matrix);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final int[][] matrix =
                {{9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9},
                        {9, 9, 9, 9, 9}};
        final int expectedOutput = 1;
        final int test = CommonTasks.differentSquares(matrix);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final int[][] matrix = {{3}};
        final int expectedOutput = 0;
        final int test = CommonTasks.differentSquares(matrix);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test4() {
        final int[][] matrix = {{3, 4, 5, 6, 7, 8, 9}};
        final int expectedOutput = 0;
        final int test = CommonTasks.differentSquares(matrix);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final int[][] matrix = {{3}, {4}, {5}, {6}, {7}};
        final int expectedOutput = 0;
        final int test = CommonTasks.differentSquares(matrix);
        Assert.assertEquals(expectedOutput, test);
    }

}

