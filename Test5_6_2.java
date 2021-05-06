import java.math.BigInteger;
import java.util.Scanner;

public class Test5_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            System.out.println(b1.add(b2));
        }
    }
}