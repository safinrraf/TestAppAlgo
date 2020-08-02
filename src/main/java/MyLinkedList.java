class MyLinkedList {

    class SinglyListNode {
        int val;
        SinglyListNode next;

        SinglyListNode(int x) {
            val = x;
        }
    }

    SinglyListNode head;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        head = null;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (head == null) {
            return -1;
        } else {
            int i = 0;
            SinglyListNode tmp = head;
            while (tmp != null) {
                if (index == i) {
                    return tmp.val;
                }
                i++;
                tmp = tmp.next;
            }
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new SinglyListNode(val);
        } else {
            final SinglyListNode cur = new SinglyListNode(val);
            cur.next = head;
            head = cur;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (head == null) {
            head = new SinglyListNode(val);
        } else {
            SinglyListNode tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new SinglyListNode(val);
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            this.addAtHead(val);
        } else {
            int i = 0;
            SinglyListNode tmp = head;
            SinglyListNode before = null;
            while (tmp.next != null) {
                if ((index - 1) == i) {
                    before = tmp;
                }
                if (index == i) {
                    break;
                }
                tmp = tmp.next;
                i++;
            }
            if (before != null) {
                final SinglyListNode newNode = new SinglyListNode(val);
                newNode.next = tmp;
                before.next = newNode;
            } else {
                tmp.next = new SinglyListNode(val);
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (head != null) {
            if (index == 0) {
                head = head.next;
            } else {
                int i = 0;
                SinglyListNode tmp = head;
                while (tmp.next != null) {
                    if ((index - 1) == i) {
                        tmp.next = tmp.next.next;
                        break;
                    }
                    tmp = tmp.next;
                    i++;
                }
            }
        }
    }
}
