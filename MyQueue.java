import java.util.Stack;

public class MyQueue {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!B.isEmpty()){
            int temp = B.pop();
            A.push(temp);
        }
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(A.isEmpty() && B.isEmpty())
            return 0;
        while(!A.isEmpty()){
            int temp = A.pop();
            B.push(temp);
        }
        return B.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(A.isEmpty() && B.isEmpty())
            return 0;
        while(!A.isEmpty()){
            int temp = A.pop();
            B.push(temp);
        }
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}