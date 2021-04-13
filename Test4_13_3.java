import java.util.Scanner;

public class Test4_13_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i - 1] < arr[i]){
                if(flag == 0){
                    flag = 1;
                }
                if(flag == -1){
                    flag = 0;
                    count++;
                }
            }else if(arr[i - 1] > arr[i]){
                if(flag == 0){
                    flag = -1;
                }
                if(flag == 1){
                    flag = 0;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}