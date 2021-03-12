//import java.awt.*;
//import java.util.ArrayList;
//
//public class Test2_25 {
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        if(nums == null || nums.length == 0)
//            return result;
//        result.add(new ArrayList<Integer>());
//        for(int i = 0; i < nums.length; i++){
//            int len = result.size();
//            for(int j = 0; j < len; j++){
//                List<Integer> temp = new ArrayList<>(result.get(j));
//                temp.add(nums[i]);
//                result.add(temp);
//            }
//        }
//        return result;
//    }
//}

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "["+val+"]";
    }
}

public class Test3_3 {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int len = length(head);
        int step = len / 2;
        for (int i = 0; i < step; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int length(ListNode head) {
        int len = 0;
        for(ListNode cur = head; cur != null; cur = cur.next){
            len++;
        }
        return len;
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null){
            return null;
        }
        if(k <= 0){
            return null;
        }
        int len = length(head);
        if(k > len){
            return null;
        }
        ListNode cur = head;
        int step = len - k;
        for(int i = 0; i < step; i++){
            cur = cur.next;
        }
        return cur;
    }

    public class Partition {
        public ListNode partition(ListNode pHead, int x) {
            if(pHead == null){
                return null;
            }
            if(pHead.next == null){
                return pHead;
            }
            ListNode smallHead = new ListNode(0);
            ListNode smallTail = smallHead;
            ListNode bigHead = new ListNode(0);
            ListNode bigTail = bigHead;
            for(ListNode cur = pHead; cur != null; cur = cur.next){
                if(cur.val < x){
                    smallTail.next = new ListNode(cur.val);
                    smallTail = smallTail.next;
                }else{
                    bigTail.next = new ListNode(cur.val);
                    bigTail = bigTail.next;
                }
            }
            smallTail.next = bigHead.next;
            return smallHead.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode restHead = new ListNode(0);
        ListNode restTail = restHead;
        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                restTail.next = cur1;
                cur1 = cur1.next;
            }else{
                restTail.next = cur2;
                cur2 = cur2.next;
            }
            restTail = restTail.next;
        }
        if(cur1 == null){
            restTail.next = cur2;
        }else{
            restTail.next = cur1;
        }
        return restHead.next;
    }
}