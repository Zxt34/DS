import java.util.Scanner;

public class Test5_16_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String res = "";
            for (int i = 0; i < n; i++) {
                String str = String.valueOf(fib(arr[i]));
                if(str.length() < 4){
                    res += str;
                }else {
                    res += str.substring(str.length() - 4, str.length());
                }
            }
            System.out.println(res);
        }
    }

    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}