import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestExtractEachKth {

    @Test
    public void test1() {
        final int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int[] etalon = {1, 2, 4, 5, 7, 8, 10};
        final int[] test = CommonTasks.extractEachKth(arr, 3);
        Assert.assertTrue(Arrays.equals(etalon, test));
    }

    @Test
    public void test2() {
        final int[] arr = {1, 1, 1, 1, 1};
        final int[] etalon = {};
        final int[] test = CommonTasks.extractEachKth(arr, 1);
        Assert.assertTrue(Arrays.equals(etalon, test));
    }

    @Test
    public void test3() {
        final int[] arr = {1, 2, 1, 2, 1, 2, 1, 2};
        final int[] etalon = {1, 1, 1, 1};
        final int[] test = CommonTasks.extractEachKth(arr, 2);
        Assert.assertTrue(Arrays.equals(etalon, test));
    }

    @Test
    public void test4() {
        final int[] arr = {1, 2, 1, 2, 1, 2, 1, 2};
        final int[] etalon = {1, 2, 1, 2, 1, 2, 1, 2};
        final int[] test = CommonTasks.extractEachKth(arr, 10);
        Assert.assertTrue(Arrays.equals(etalon, test));
    }

    @Test
    public void test5() {
        final int[] arr = {2, 4, 6, 8, 10};
        final int[] etalon = {2, 6, 10};
        final int[] test = CommonTasks.extractEachKth(arr, 2);
        Assert.assertTrue(Arrays.equals(etalon, test));
    }

    @Test
    public void test6() {
        final int[] arr = {2, 4, 6, 8, 10, 12, 14};
        final int[] etalon = {2, 4, 6, 8, 10, 14};
        final int[] test = CommonTasks.extractEachKth(arr, 6);
        Assert.assertTrue(Arrays.equals(etalon, test));
    }

}
