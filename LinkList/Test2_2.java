package LinkList;

public class Test2_2 {
    public static Node createNode(){
        Node num1 = new Node(1);
        Node num2 = new Node(2);
        Node num3 = new Node(3);
        Node num4 = new Node(4);
        Node num5 = new Node(5);

        num1.next = num2;
        num2.next = num3;
        num3.next = num4;
        num4.next = num5;
        num5.next = null;

        return num1;
    }

    public static void main(String[] args) {
        Node head = createNode();

        System.out.println("1.遍历打印链表的每个元素：");
        for(Node cur = head;cur != null;cur = cur.next){
            System.out.println(cur.val);
        }

        System.out.println("2.遍历找到链表的最后一个节点：");
        Node cur = head;
        while(cur != null && cur.next != null){
            cur = cur.next;
        }
        System.out.println(cur);

        System.out.println("3.遍历找到链表的倒数第二个节点：");
        Node cur1 = head;
        while(cur1 != null && cur1.next != null && cur1.next.next != null){
            cur1 = cur1.next;
        }
        System.out.println(cur1);

        System.out.println("4.遍历找到第n个节点：");
        int n = 2;
        Node cur2 = head;
        for (int i = 1; i < n; i++) {
            cur2 = cur2.next;
        }
        System.out.println(cur2);

        System.out.println("5.遍历计算链表的元素个数为：");
        int count = 0;
        for (Node cur3 = head; cur3 != null; cur3 = cur3.next) {
            count++;
        }
        System.out.println(count);

        System.out.println("6.遍历查找链表是否包含某个元素：");
        int target = 4;
        Node cur4 = head;
        for (; cur4 != null; cur4 = cur4.next) {
            if(cur4.val == 4)
                break;
        }
        if(cur4 == null)
            System.out.println("没找到该元素");
        else
            System.out.println("找到该元素了");
    }
}