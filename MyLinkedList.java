import java.util.*;

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//
//    @Override
//    public String toString() {
//        return "["+val+"]";
//    }
//}

class Node{
    int val;
    Node prev = null;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int length() {
        return this.length;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
        return;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
        return;
    }

    public void add(int index, int val) {
        Node newNode = new Node(val);
        if(index < 0 || index > length){
            return;
        }
        if(index == 0){
            addFirst(val);
            return;
        }
        if(index == length){
            addLast(val);
            return;
        }
        Node nextNode = getNode(index);
        Node prevNode = newNode.prev;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        newNode.next = nextNode;
        nextNode.prev = newNode;
        length++;
        return;
    }

    public void removeFirst() {
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        head.next.prev = null;
        head = head.next;
        length--;
        return;
    }

    public void removeLast() {
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
        length--;
        return;
    }

    public void removeByIndex(int index) {
        if(index < 0 || index >= length){
            return;
        }
        if(index == 0){
            removeFirst();
            return;
        }
        if(index == length - 1){
            removeLast();
            return;
        }
        Node toDelete = getNode(index);
        Node nextNode = toDelete.next;
        Node prevNode = toDelete.prev;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
        length--;
        return;
    }

    public void removeByValue(int val) {
        int index = indexOf(val);
        if(index == -1){
            return;
        }
        removeByIndex(index);
        return;
    }

    public Node getNode(int index) {
        if(index < 0 || index >= length){
            return null;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int get(int index) {
        if(index < 0 || index >= length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNode(index).val;
    }

    public int indexOf(int value) {
        Node cur = head;
        for (int i = 0; i < length; i++) {
            if(cur.val == value){
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }

    public void set(int index, int value) {
        if(index < 0 || index >= length){
            throw new ArrayIndexOutOfBoundsException();
        }
        getNode(index).val = value;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        ListNode cur1 = head;
        ListNode cur2 = fast;
        while(cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
