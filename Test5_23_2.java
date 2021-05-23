import java.util.Scanner;

public class Test5_23_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(isPrimer(n)){
                System.out.print(n + " = " + n);
                continue;
            }
            System.out.print(n + " = ");
            for (int i = 2; i < Math.sqrt(n); i++) {
                if(n % i == 0) {
                    while (n % i == 0) {
                        System.out.print(i);
                        n /= i;
                        if (n % i == 0) {
                            System.out.print(" * ");
                        }
                    }
                    System.out.print(" * ");
                }
            }
            if(n != 1){
                System.out.print(n);
            }
            System.out.println();
        }
    }

    private static boolean isPrimer(int n) {
        for (int i = 2; i < Math.pow(n,0.5); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}