package StackQueue;

public class MyQueue {
    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head = null;
    private Node tail = null;

    public boolean offer(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return true;
        }
        tail.next = newNode;
        tail = tail.next;
        return true;
    }

    public Integer poll(){
        if(head == null){
            return null;
        }
        int ret = head.val;
        if(head.next == null){
            head = null;
            return ret;
        }
        head = head.next;
        return ret;
    }

    public Integer peek(){
        if(head == null){
            return null;
        }
        return head.val;
    }
}