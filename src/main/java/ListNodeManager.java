import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ListNodeManager {
    /*Not working properly*/
    public static boolean compare(final ListNode<Integer> list1, final ListNode<Integer> list2) {
        Integer cnt1 = getNodeCount(list1);
        Integer cnt2 = getNodeCount(list2);

        if (cnt1 != cnt2)
            return false;

        ListNode<Integer> tmp1 = getNextNode(list1);
        ListNode<Integer> tmp2 = getNextNode(list2);

        while (tmp1 != null) {
            if (tmp1.value != tmp2.value)
                return false;
            tmp1 = getNextNode(tmp1);
            tmp2 = getNextNode(tmp2);
        }
        return true;
    }

    static Integer getNodeCount(final ListNode<Integer> list) {
        if (list == null)
            return 0;
        ListNode<Integer> tmp = getNextNode(list);
        if (tmp == null)
            return 1;

        Integer cnt = 1;
        while (tmp != null) {
            cnt++;
            tmp = getNextNode(tmp);
        }
        return cnt;
    }

    static ListNode<Integer> getNextNode(final ListNode<Integer> list) {
        if (list == null)
            return null;
        return list.next;
    }

    public static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> ret = l;
        ListNode<Integer> tmp = l;
        while (tmp != null) {
            if (tmp.next == null && tmp.value == null)
                break;
            if (tmp.value == k) {
                if (tmp.next != null) {
                    tmp.value = tmp.next.value;
                    tmp.next = tmp.next.next;
                } else {
                    tmp.next = null;
                    tmp.value = null;
                }
            } else {
                tmp = tmp.next;
            }
        }
        if (ret == null)
            return null;

        return ret.value == null && ret.next == null ? null : trimTrailingNulls(ret);
    }

    public static ListNode<Integer> trimTrailingNulls(ListNode<Integer> l) {
        Queue<Integer> queue = new LinkedList<>();
        ListNode<Integer> ret = l;
        while (ret != null) {
            if (ret.value != null)
                queue.add(ret.value);
            ret = ret.next;
        }
        ListNode<Integer> newList = new ListNode<>(queue.poll());
        ListNode<Integer> tmp = newList;
        while (!queue.isEmpty())
            tmp = insert(tmp, queue.poll());

        return newList;
    }

    public static ListNode<Integer> insert(ListNode<Integer> root, Integer data) {
        root.next = new ListNode<>(data);
        return root.next;
    }

    public static ListNode reverse(ListNode<Integer> head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static boolean isListPalindrome(ListNode<Integer> l) {
        ListNode<Integer> tmp = l;
        final ArrayList<Integer> arr = new ArrayList<>();
        while (tmp != null) {
            arr.add(tmp.value);
            tmp = tmp.next;
        }
        for (int i = 0; i < arr.size() / 2; i++)
            if (!arr.get(i).equals(arr.get(arr.size() - 1 - i)))
                return false;
        return true;
    }

    public static ListNode<Integer> initListNode(Integer[] arr) {
        if (arr.length == 0)
            return null;
        ListNode<Integer> root = new ListNode<>(arr[0]);
        ListNode<Integer> tmp = root;
        for (Integer i = 1; i < arr.length; i++)
            tmp = insert(tmp, arr[i]);

        return root;
    }

    ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        return null;
    }
}
