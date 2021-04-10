import java.util.*;

public class Test4_10_1 {
    public int Fibonacci(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int f0 = 0;
        int f1 = 1;
        map.put(0,f0);
        map.put(1,f1);
        for(int i = 2; i <= 39; i++){
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            map.put(i,f2);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getKey() == n){
                return entry.getValue();
            }
        }
        return -1;
    }
}