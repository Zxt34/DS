import java.util.Stack;

public class Test4_10_3 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while(!stack2.isEmpty()){
            Integer temp = stack2.pop();
            stack1.push(temp);
        }
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return 0;
        }
        while(!stack1.isEmpty()){
            Integer temp = stack1.pop();
            stack2.push(temp);
        }
        return stack2.pop();
    }
}