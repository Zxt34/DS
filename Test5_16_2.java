import java.math.BigInteger;
import java.util.Scanner;

public class Test5_16_2 {
    public static void main(String[] args) {
        BigInteger m,n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n = sc.nextBigInteger();
            m = (n.add(new BigInteger("-1")).mod(new BigInteger("9"))).add(new BigInteger("1"));
            System.out.println(m);
        }
    }
}