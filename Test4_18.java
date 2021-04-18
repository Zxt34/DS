import java.util.Scanner;

public class Test4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = (a * b) / gcd(a,b);
        System.out.println(res);
    }

    private static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b,a % b);
    }
}