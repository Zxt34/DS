import java.util.Scanner;

public class Test4_29_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }
    
    public static int count(int n){
        if(n > 0 && n <= 500000) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if(perfectNum(i)){
                    count++;
                }
            }
            return count;
        }else{
            return -1;
        }
    }

    public static boolean perfectNum(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
}