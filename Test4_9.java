import java.util.HashMap;

public class Test4_9 {
    public int[] twoSum (int[] numbers, int target) {
        int[] ret=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                ret[0]=map.get(numbers[i])+1;
                ret[1]=i+1;
            }else{
                map.put(target-numbers[i],i);
            }
        }
        return ret;
    }
}