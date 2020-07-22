import org.junit.Assert;
import org.junit.Test;

public class TestFileNaming {
    @Test
    public void test1() {
        final String[] names = {"doc", "doc", "image", "doc(1)", "doc"};
        final String[] expectedOutput = {"doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"};
        final String[] test = CommonTasks.fileNaming(names);
        Assert.assertArrayEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final String[] names =          {"a(1)", "a(6)", "a", "a",    "a",    "a",    "a",    "a",    "a",    "a",    "a",     "a"};
        final String[] expectedOutput = {"a(1)", "a(6)", "a", "a(2)", "a(3)", "a(4)", "a(5)", "a(7)", "a(8)", "a(9)", "a(10)", "a(11)"};
        final String[] test = CommonTasks.fileNaming(names);
        Assert.assertArrayEquals(expectedOutput, test);
    }

    @Test
    public void test3() {
        final String[] names =          {"dd", "dd(1)", "dd(2)", "dd",    "dd(1)",    "dd(1)(2)", "dd(1)(1)",    "dd",    "dd(1)"};
        final String[] expectedOutput = {"dd", "dd(1)", "dd(2)", "dd(3)", "dd(1)(1)", "dd(1)(2)", "dd(1)(1)(1)", "dd(4)", "dd(1)(3)"};
        final String[] test = CommonTasks.fileNaming(names);
        Assert.assertArrayEquals(expectedOutput, test);
    }

    @Test
    public void test4() {
        final String[] names = {"a", "b", "cd", "b ", "a(3)"};
        final String[] expectedOutput = {"a", "b", "cd", "b ", "a(3)"};
        final String[] test = CommonTasks.fileNaming(names);
        Assert.assertArrayEquals(expectedOutput, test);
    }

    @Test
    public void test5() {
        final String[] names =          {"name", "name",    "name(1)",    "name(3)", "name(2)", "name(2)"};
        final String[] expectedOutput = {"name", "name(1)", "name(1)(1)", "name(3)", "name(2)", "name(2)(1)"};
        final String[] test = CommonTasks.fileNaming(names);
        Assert.assertArrayEquals(expectedOutput, test);
    }

    @Test
    public void test6() {
        final String[] names = {};
        final String[] expectedOutput = {};
        final String[] test = CommonTasks.fileNaming(names);
        Assert.assertArrayEquals(expectedOutput, test);
    }

}
