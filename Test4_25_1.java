import java.util.Scanner;

public class Test4_25_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int i = n / 2;
            for (; i >= 2; i--) {
                if(isSuShu(i) && isSuShu(n - i)){
                    break;
                }
            }
            System.out.println(i);
            System.out.println(n - i);
        }
    }

    public static boolean isSuShu(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}