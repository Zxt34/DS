import java.util.Scanner;

public class Test4_20_3 {
    public static void main(String[] args) {
//        String x = "fmn";
//        x.toUpperCase();
//        String y = x.replace("f","F");
//        y = y + "wxy";
//        System.out.println(x);
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//        int n = 25;
//        long sum = mul(n);
//        String str = String.valueOf(mul(n));
//        int count = 0;
//        for (int i = str.length() - 1; i >= 0; i--) {
//            if (str.charAt(i) != '0')
//                break;
//            else
//                count++;
//        }
//        System.out.println(count);
//    }
//}
//    public static long mul(int n){
//        long sum = 1;
//        for (int i = n; i >= 1; i--) {
//            sum *= i;
//        }
//        return sum;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n >= 1 && n <= 1000){
            while(n != 0){
                count += n / 5;
                n /= 5;
            }
        }
        System.out.println(count);
    }
}