import java.util.HashMap;
import java.util.Map;

public class Test4_10_2 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            Integer value = map.get(array[i]);
            if(value == null){
                map.put(array[i],1);
            }else{
                map.put(array[i],value + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > array.length/2)
                return entry.getKey();
        }
        return 0;
    }
}