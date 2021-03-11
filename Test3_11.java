import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class RecentCounter {
    Queue<Integer> A = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        while(!A.isEmpty()){
            if(A.peek() < t - 3000){
                A.poll();
            }else{
                break;
            }
        }
        A.offer(t);
        return A.size();
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> A = new Stack<>();
        Stack<Character> B = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if(s == '#'){
                if(A.empty()){
                    continue;
                }else{
                    A.pop();
                }
            }else {
                A.push(s);
            }
        }
        for (int i = 0; i < T.length(); i++) {
            char t = T.charAt(i);
            if(t == '#'){
                if(B.empty()){
                    continue;
                }else{
                    B.pop();
                }
            }else {
                B.push(t);
            }
        }

        return A.equals(B);
    }
}

class MyCircularDeque {
    private int[] elements;
    private int size;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        elements = new int[k];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        for(int i = size - 1; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        elements[0] = value;
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        elements[size] = value;
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        for(int i = 1; i < size; i++){
            elements[i - 1] = elements[i];
        }
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        elements[size - 1] = 0;
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return size == 0 ? -1 : elements[0];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        return size == 0 ? -1 : elements[size - 1];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == elements.length;
    }
}