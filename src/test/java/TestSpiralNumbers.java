import org.junit.Assert;
import org.junit.Test;

public class TestSpiralNumbers {
    @Test
    public void test1() {
        final int n = 3;
        final int[][] expectedOutput = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        final int[][] test = CommonTasks.spiralNumbers(n);
        Assert.assertArrayEquals(expectedOutput[0], test[0]);
        Assert.assertArrayEquals(expectedOutput[1], test[1]);
        Assert.assertArrayEquals(expectedOutput[2], test[2]);
    }
}
