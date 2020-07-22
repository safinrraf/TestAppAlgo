import org.junit.Assert;
import org.junit.Test;

public class TestListPalindrome {
    @Test
    public void test1() {
        final Integer[] arr = {1, 0, 1};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final boolean b = ListNodeManager.isListPalindrome(test1);

        Assert.assertTrue(b);
    }

    @Test
    public void test2() {
        final Integer[] arr = {1, 2, 2, 3};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final boolean b = ListNodeManager.isListPalindrome(test1);

        Assert.assertFalse(b);
    }

    @Test
    public void test3() {
        final Integer[] arr = {1, 1000000000, -1000000000, -1000000000, 1000000000, 1};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final boolean b = ListNodeManager.isListPalindrome(test1);

        Assert.assertTrue(b);
    }

    @Test
    public void test4() {
        final Integer[] arr = {1, 2, 3, 3, 2};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final boolean b = ListNodeManager.isListPalindrome(test1);

        Assert.assertFalse(b);
    }

    @Test
    public void test5() {
        final Integer[] arr = {1, 2, 3, 1, 2, 3};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final boolean b = ListNodeManager.isListPalindrome(test1);

        Assert.assertFalse(b);
    }

    @Test
    public void test6() {
        final Integer[] arr = {};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final boolean b = ListNodeManager.isListPalindrome(test1);

        Assert.assertTrue(b);
    }

    @Test
    public void test7() {
        final Integer[] arr = {3, 5, 3, 5};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final boolean b = ListNodeManager.isListPalindrome(test1);

        Assert.assertFalse(b);
    }

}
