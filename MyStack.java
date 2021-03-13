import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        A.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(A.isEmpty() && B.isEmpty())
            return 0;
        while(A.size() > 1){
            int temp = A.poll();
            B.offer(temp);
        }
        int res = A.poll();
        swapAB();
        return res;
    }

    private void swapAB() {
        Queue<Integer> temp = A;
        A = B;
        B = temp;
    }

    /** Get the top element. */
    public int top() {
        if(A.isEmpty() && B.isEmpty())
            return 0;
        while(A.size() > 1){
            int temp = A.poll();
            B.offer(temp);
        }
        int res = A.poll();
        B.offer(res);
        swapAB();
        return res;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
