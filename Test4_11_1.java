import java.util.Arrays;
import java.util.Scanner;

public class Test4_11_1 {
    public static long Sum(int n,int[] arr){
        Arrays.sort(arr);
        long sum = 0;
        for (int i = n; i < arr.length - 1; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[3*n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Sum(n,arr));
    }
}