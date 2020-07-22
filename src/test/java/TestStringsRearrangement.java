import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestStringsRearrangement {

    @Test
    public void test1() {
        final String[] arr = {
                "aba",
                "bbb",
                "bab"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test2() {
        final String[] arr = {
                "ab",
                "bb",
                "aa"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test3() {
        final String[] arr = {"q", "q"};
        Assert.assertFalse(CommonTasks.stringsRearrangement(arr));
    }

    @Test
    public void test4() {
        final String[] arr = {"zzzzab", "zzzzbb", "zzzzaa"};
        Assert.assertTrue(CommonTasks.stringsRearrangement(arr));
    }

    @Test
    public void test5() {
        final String[] arr = {"ab", "ad", "ef", "eg"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test6() {
        final String[] arr = {
                "abc",
                "bef",
                "bcc",
                "bec",
                "bbc",
                "bdc"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test7() {
        final String[] arr = {"abc", "abx", "axx", "abc"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test8() {
        final String[] arr = {"abc", "abx", "axx", "abx", "abc"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test10() {
        final String[] arr = {"ff", "gf", "af", "ar", "hf"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test14() {
        final String[] arr = {"oh", "eh", "ah", "po", "op"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test17() {
        final String[] arr = {"abc", "xbc", "xxc", "xbc", "aby", "ayy", "aby", "azc"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test__1() {
        final String[] arr = {"a", "b", "f", "f", "f", "f", "f", "f", "b", "a"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test__2() {
        final String[] arr = {"a", "b", "c", "d", "e", "f", "g"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test__3() {
        final String[] arr = {"zzzabzczaba", "zzzabzczaaa", "zzzabzczabb", "zzzabzczbbb"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test__4() {
        final String[] arr = {"abacabaabczzzzz", "abacababefzzzzz", "abacababcczzzzz", "abacababeczzzzz", "abacababbczzzzz", "abacababdczzzzz"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test__5() {
        final String[] arr = {"abc", "xbc", "axc", "abx"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test__6() {
        final String[] arr = {"e", "e", "f", "f", "f", "f"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertFalse(b);
    }

    @Test
    public void test__8() {
        final String[] arr = {"eee", "eee", "eev"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test__9() {
        final String[] arr = {"eee", "eeb", "eee", "eeb", "eee", "eeb", "eee"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }

    @Test
    public void test__10() {
        final String[] arr = {"aa", "aa", "aa", "ab", "ab", "ab"};
        final boolean b = CommonTasks.stringsRearrangement(arr);
        Assert.assertTrue(b);
    }
}
