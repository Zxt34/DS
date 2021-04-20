import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test4_20_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        int k = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        int size = list.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]);
            if(i != k - 1){
                System.out.print(" ");
            }
        }
    }
}