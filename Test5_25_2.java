import java.math.BigInteger;
import java.util.Scanner;

public class Test5_25_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] fib = new BigInteger[81];
        fib[0] = new BigInteger("0");
        fib[1] = new BigInteger("1");
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        while(sc.hasNext()){
            int from = sc.nextInt();
            int to = sc.nextInt();
            BigInteger sum = new BigInteger("0");
            for (int i = from; i <= to; i++) {
                sum = sum.add(fib[i]);
            }
            System.out.println(sum);
        }
    }
}