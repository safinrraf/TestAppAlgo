import org.junit.Assert;
import org.junit.Test;

public class TestElectionWinners {
    @Test
    public void test0() {
        final int[] votes = {2};
        final int k = 3;
        final int etalon = 1;
        final int test = CommonTasks.electionsWinners(votes, k);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test1() {
        final int[] votes = {2, 3, 5, 2};
        final int k = 3;
        final int etalon = 2;
        final int test = CommonTasks.electionsWinners(votes, k);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test2() {
        final int[] votes = {1, 3, 3, 1, 1};
        final int k = 0;
        final int etalon = 0;
        final int test = CommonTasks.electionsWinners(votes, k);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test3() {
        final int[] votes = {5, 1, 3, 4, 1};
        final int k = 0;
        final int etalon = 1;
        final int test = CommonTasks.electionsWinners(votes, k);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test4() {
        final int[] votes = {1, 1, 1, 1};
        final int k = 1;
        final int etalon = 4;
        final int test = CommonTasks.electionsWinners(votes, k);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test5() {
        final int[] votes = {1, 1, 1, 1};
        final int k = 0;
        final int etalon = 0;
        final int test = CommonTasks.electionsWinners(votes, k);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test6() {
        final int[] votes = {3, 1, 1, 3, 1};
        final int k = 2;
        final int etalon = 2;
        final int test = CommonTasks.electionsWinners(votes, k);
        Assert.assertEquals(etalon, test);
    }
}
