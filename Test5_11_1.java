import java.util.Scanner;

public class Test5_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            while(t > 0){
                t--;
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = new int[2 * n];
                for (int i = 0; i < 2 * n; i++) {
                    arr[i] = sc.nextInt();
                }
                int[] res = new int[2 * n];
                while(k > 0){
                    res = getRes(arr,n);
                    arr = res;
                    k--;
                }
                for (int i = 0; i < 2 * n; i++) {
                    if(i == 2 * n - 1){
                        System.out.println(res[i]);
                    }else {
                        System.out.print(res[i] + " ");
                    }
                }
            }
        }
    }

    private static int[] getRes(int[] arr, int n) {
        int[] res = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            res[k] = arr[i];
            k++;
            res[k] = arr[n + i];
            k++;
        }
        return res;
    }
}