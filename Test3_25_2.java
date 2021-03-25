import java.util.*;

public class Test3_25_2 {
    public boolean isValid (String s) {
        // write code here
        if(s.isEmpty()){
            return true;
        }
        if(s.length() == 1){
            return false;
        }
        Stack<Character> res = new Stack<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                res.push(c);
            }else{
                if(res.isEmpty()){
                    return false;
                }
                if(c == ')'){
                    if(res.peek() == '('){
                        res.pop();
                    }else{
                        return false;
                    }
                }
                if(c == ']'){
                    if(res.peek() == '['){
                        res.pop();
                    }else{
                        return false;
                    }
                }
                if(c == '}'){
                    if(res.peek() == '{'){
                        res.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return res.isEmpty();
    }
}