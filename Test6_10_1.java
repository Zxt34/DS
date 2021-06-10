import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test6_10_1 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                int val = map.get(array[i]);
                map.put(array[i],val + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > (array.length / 2)){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

        }
    }
}