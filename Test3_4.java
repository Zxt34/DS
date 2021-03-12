//import java.util.*;
//
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

public class Test3_4 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = length(headA);
        int len2 = length(headB);
        if(len1 > len2){
            int step = len1 - len2;
            for(int i = 0; i < step; i++){
                headA = headA.next;
            }
        }else{
            int step = len2 - len1;
            for(int i = 0; i < step; i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public boolean chkPalindrome(ListNode A) {
        if(A == null){
            return true;
        }
        if(A.next == null){
            return true;
        }
        ListNode bHead = new ListNode(0);
        ListNode bTail = bHead;
        for(ListNode cur = A; cur != null; cur = cur.next){
            bTail.next = new ListNode(cur.val);
            bTail = bTail.next;
        }
        ListNode B = bHead.next;
        ListNode prev = null;
        ListNode cur = B;
        while(cur != null){
            ListNode next = cur.next;
            if(next == null){
                B = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode head1 = A;
        ListNode head2 = B;
        while(head1 != null && head2 != null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur != null && cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
            }else{
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
            }
            cur = cur.next;
        }
        return newHead.next;
    }

    public static int length(ListNode head) {
        int len = 0;
        for(ListNode cur = head; cur != null; cur = cur.next){
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode aHead = new ListNode(0);
        ListNode aTail = aHead;
        ListNode bHead = new ListNode(0);
        ListNode bTail = bHead;
        ListNode cHead = new ListNode(0);
        ListNode cTail = cHead;
        for (int i = 6; i < 9; i++) {
            cTail.next = new ListNode(i);
            cTail = cTail.next;
        }
        ListNode C = cHead.next;
        for (int i = 1; i < 4; i++) {
            aTail.next = new ListNode(i);
            aTail = aTail.next;
        }
        aTail.next = C;
        ListNode A = aHead.next;
        for (int i = 4; i < 6; i++) {
            bTail.next = new ListNode(i);
            bTail = bTail.next;
        }
        bTail.next = C;
        ListNode B = bHead.next;
        System.out.println(getIntersectionNode(A,B));
    }
}
