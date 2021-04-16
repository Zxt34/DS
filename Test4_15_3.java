import java.util.Scanner;

public class Test4_15_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxNum = arr[0];
        int curNum = arr[0];
        for (int i = 0; i < n; i++) {
            curNum = Math.max(curNum + arr[i],arr[i]);
            if(curNum > maxNum)
                maxNum = curNum;
        }
        System.out.println(maxNum);
    }
}