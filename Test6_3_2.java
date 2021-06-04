import java.util.Scanner;
import java.util.Stack;

public class Test6_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                switch (s){
                    case "+":
                        stack.push(String.valueOf(Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop())));
                        break;
                    case "-":
                        stack.push(String.valueOf(Integer.valueOf(stack.pop()) - Integer.valueOf(stack.pop())));
                        break;
                    case "*":
                        stack.push(String.valueOf(Integer.valueOf(stack.pop()) * Integer.valueOf(stack.pop())));
                        break;
                    case "/":
                        stack.push(String.valueOf(Integer.valueOf(stack.pop()) / Integer.valueOf(stack.pop())));
                        break;
                    default:
                        stack.push(s);
                        break;
                }
            }
            System.out.println(stack.pop());
        }
    }
}