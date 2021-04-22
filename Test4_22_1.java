import java.util.Scanner;

public class Test4_22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int f0 = 0;
            int f1 = 1;
            while (f0 < n && f1 < n) {
                int f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            int res = (n - f0) > (f1 - n) ? (f1 - n) : (n - f0);
            System.out.println(res);
        }
    }
}