public class Test3_15_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode tail=head;
        int count=0;
        while(l1!=null||l2!=null||count!=0){
            int val1=(l1!=null?l1.val:0);
            int val2=(l2!=null?l2.val:0);
            int sumVal=val1+val2+count;
            count=sumVal/10;
            ListNode sum=new ListNode(sumVal%10);
            tail.next=sum;
            tail=sum;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return head.next;
    }
}
