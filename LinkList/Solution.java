package LinkList;

class ListNode {
      int val;
      ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        for(;cur != null;){
            if(cur.val == val){
                prev.next = cur.next;
                cur = prev.next;
            }else{
                cur = cur.next;
                prev = prev.next;
            }
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode newHead = null;
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            if(next == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return newHead;
    }
}