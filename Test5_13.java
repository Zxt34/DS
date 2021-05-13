import java.util.HashMap;
import java.util.Map;

public class Test5_13 {
    public static void main(String[] args) {

    }

    public int getValue(int[] gifts, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < gifts.length; i++) {
            if(!map.containsKey(gifts[i])){
                map.put(gifts[i],1);
            }else{
                int value = map.get(gifts[i]);
                map.put(gifts[i],value + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > (n / 2)){
                return entry.getKey();
            }
        }
        return 0;
    }
}