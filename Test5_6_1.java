import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test5_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n < 3)
                System.out.println(-1);
            ArrayList<HashMap<Integer,Integer>> list = new ArrayList<>();
            HashMap<Integer,Integer> map1 = new HashMap<>();
            map1.put(1,1);
            list.add(map1);
            HashMap<Integer,Integer> map2 = new HashMap<>();
            map2.put(1,1);
            map2.put(2,1);
            map2.put(3,1);
            list.add(map2);
            for (int i = 3; i <= n; i++) {
                HashMap<Integer,Integer> map = new HashMap<>();
                map.put(1,1);
                for (int j = 2; j < 2 * i - 1; j++) {
                    map.put(j,list.get(i - 2).getOrDefault(j,0) + list.get(i - 2).getOrDefault(j - 1,0) + list.get(i - 2).getOrDefault(j - 2,0));
                }
                map.put(2 * i - 1,1);
                list.add(map);
            }
            HashMap<Integer,Integer> map = list.get(n - 1);
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() % 2 == 0) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }
}