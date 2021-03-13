import java.util.Stack;

public class Test3_13 {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                res.push(c);
                continue;
            }
            if(res.isEmpty()){
                return false;
            }
            char top = res.pop();
            if(top == '(' && c == ')')
                continue;
            if(top == '{' && c == '}')
                continue;
            if(top == '[' && c == ']')
                continue;
            return false;
        }
        if(res.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}