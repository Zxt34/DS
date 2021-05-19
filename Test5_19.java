import java.util.Scanner;

public class Test5_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            int t1 = 0,t2 = 0,t3 = 0;
            if(a + b > c && Math.abs(a - b) < c){
                t1 = 1;
            }
            if(a + c > b && Math.abs(a - c) < b){
                t2 = 1;
            }
            if(c + b > a && Math.abs(c - b) < a){
                t3 = 1;
            }
            if(t1 + t2 + t3 > 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public int Add(int num1,int num2) {
        int res = 0;
        int c = 0;
        do{
            res = num1 ^ num2;
            c = (num1 & num2) << 1;
            num1 = res;
            num2 = c;
        }while(c != 0);
        return res;
    }
}