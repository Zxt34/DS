import java.util.Scanner;

public class Test5_22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(isPrimer(n)){
                System.out.println(1);
                continue;
            }
            int count = 0;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if(n % i ==0){
                    while(n % i ==0){
                        n /= i;
                    }
                    count++;
                }
            }
            if(n != 1)
                count++;
            System.out.println(count);
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