import java.util.Scanner;

public class Test5_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] bn = new int[n];
            for (int i = 0; i < n; i++) {
                bn[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if(bn[i] <= a){
                    a = a + bn[i];
                }else{
                    a = a + big(a,bn[i]);
                }
            }
            System.out.println(a);
        }
    }

    public static int big(int a,int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}