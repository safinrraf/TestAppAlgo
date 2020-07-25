import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void addAtHead() {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
        linkedList.addAtHead(1);
        linkedList.addAtHead(3);
        linkedList.addAtHead(5);
        printSinglyListNode(linkedList);
        assertNotNull(linkedList);
    }

    @Test
    public void addAtTail() {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
        linkedList.addAtTail(1);
        linkedList.addAtTail(3);
        printSinglyListNode(linkedList);
        assertNotNull(linkedList);
    }

    @Test
    public void testGetIndex() {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
        linkedList.addAtTail(1); //0
        linkedList.addAtTail(3); //1
        linkedList.addAtTail(5); //2
        linkedList.addAtTail(6); //3
        int expectedOutput = 1;
        int test = linkedList.get(0);
        assertEquals(expectedOutput, test);

        expectedOutput = -1;
        test = linkedList.get(10);
        assertEquals(expectedOutput, test);

        expectedOutput = 6;
        test = linkedList.get(3);
        assertEquals(expectedOutput, test);

        assertNotNull(linkedList);
    }

    @Test
    public void testAddAtIndex() {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
        linkedList.addAtTail(1); //0
        linkedList.addAtTail(3); //1
        linkedList.addAtTail(5); //2
        linkedList.addAtTail(6); //3

        linkedList.addAtIndex(4, 100);

        printSinglyListNode(linkedList);

        assertNotNull(linkedList);
    }

    @Test
    public void testDeleteAtIndex() {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
        linkedList.addAtTail(1); //0
        linkedList.addAtTail(3); //1
        linkedList.addAtTail(5); //2
        linkedList.addAtTail(6); //3

        linkedList.deleteAtIndex(2);

        printSinglyListNode(linkedList);

        assertNotNull(linkedList);
    }

    public void printSinglyListNode(final MyLinkedList myLinkedList) {
        MyLinkedList.SinglyListNode tmp = myLinkedList.head;
        int i = 0;
        while (tmp != null) {
            System.out.println(String.format("%d -> %d", i, tmp.val));
            tmp = tmp.next;
        }
    }
}