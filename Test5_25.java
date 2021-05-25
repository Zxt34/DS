import java.util.Scanner;

public class Test5_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fib = new long[100002];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1000000;
        }
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.printf((n < 29 ? "%d\n" : "%06d\n"),fib[n]);
        }
    }
}