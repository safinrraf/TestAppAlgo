import org.junit.Assert;
import org.junit.Test;

public class TestDifferentSymbolsNaive {

    @Test
    public void test1() {
        final int i = CommonTasks.differentSymbolsNaive("cabca");
        Assert.assertEquals(3, i);
    }

    @Test
    public void test2() {
        final int i = CommonTasks.differentSymbolsNaive("aba");
        Assert.assertEquals(2, i);
    }

    @Test
    public void test3() {
        final int i = CommonTasks.differentSymbolsNaive("ccccccccccc");
        Assert.assertEquals(1, i);
    }

    @Test
    public void test4() {
        final int i = CommonTasks.differentSymbolsNaive("bcaba");
        Assert.assertEquals(3, i);
    }

    @Test
    public void test5() {
        final int i = CommonTasks.differentSymbolsNaive("codesignal");
        Assert.assertEquals(10, i);
    }
}
