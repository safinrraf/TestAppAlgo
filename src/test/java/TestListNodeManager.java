import org.junit.Assert;
import org.junit.Test;

public class TestListNodeManager {

    @Test
    public void testGetNodeCount() {
        Integer[] arr3 = {123};
        ListNode<Integer> test3 = ListNodeManager.initListNode(arr3);
        Integer cnt = ListNodeManager.getNodeCount(test3);
        Assert.assertTrue(1 == cnt);
    }

    @Test
    public void testGetNodeCountWithNull() {
        Integer cnt = ListNodeManager.getNodeCount(null);
        Assert.assertTrue(0 == cnt);
    }

    @Test
    public void testCompare1() {
        Integer[] arr3 = {123};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr3);

        ListNode<Integer> test2 = ListNodeManager.initListNode(arr3);

        Assert.assertTrue(ListNodeManager.compare(test1, test2));
    }

    @Test
    public void testCompare2() {
        Integer[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr3);

        ListNode<Integer> test2 = ListNodeManager.initListNode(arr3);
        Assert.assertTrue(ListNodeManager.compare(test1, test2));
    }

    @Test
    public void testCompare3() {
        Integer[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr3);

        Integer[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode<Integer> test2 = ListNodeManager.initListNode(arr4);
        Assert.assertTrue(!ListNodeManager.compare(test1, test2));
    }

    @Test
    public void testRemove1() {
        final Integer[] arr = {3, 1, 2, 3, 4, 5};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final ListNode<Integer> listNode = ListNodeManager.removeKFromList(test1, 3);

        final Integer[] arrTest = {1, 2, 4, 5};
        ListNode<Integer> listNodeEtalon = ListNodeManager.initListNode(arrTest);
        Assert.assertTrue(ListNodeManager.compare(listNodeEtalon, listNode));
    }

    @Test
    public void testRemove2() {
        final Integer[] arr = {1000, 1000};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final ListNode<Integer> listNode = ListNodeManager.removeKFromList(test1, 1000);

        final Integer[] arrTest = {};
        ListNode<Integer> listNodeEtalon = ListNodeManager.initListNode(arrTest);
        Assert.assertTrue(ListNodeManager.compare(listNodeEtalon, listNode));
    }

    @Test
    public void testRemove3() {
        final Integer[] arr = {123, 456, 789, 0};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final ListNode<Integer> listNode = ListNodeManager.removeKFromList(test1, 0);

        final Integer[] arrTest = {123, 456, 789};
        ListNode<Integer> listNodeEtalon = ListNodeManager.initListNode(arrTest);
        Assert.assertTrue(ListNodeManager.compare(listNodeEtalon, listNode));
    }

    @Test
    public void testRemove4() {
        final Integer[] arr = {};
        ListNode<Integer> test1 = ListNodeManager.initListNode(arr);
        final ListNode<Integer> listNode = ListNodeManager.removeKFromList(test1, -1000);

        final Integer[] arrTest = {};
        ListNode<Integer> listNodeEtalon = ListNodeManager.initListNode(arrTest);
        Assert.assertTrue(ListNodeManager.compare(listNodeEtalon, listNode));
    }

}
