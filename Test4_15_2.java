import java.util.Scanner;

public class Test4_15_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        System.out.println(solve(M,N));
    }

    public static String solve(int M,int N){
        if(M == 0){
            return "0";
        }
        boolean flag = true;
        if(M < 0){
            M = -M;
            flag = false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        String str = "0123456789ABCDEF";
        while(M != 0){
            stringBuffer.append(str.charAt(M % N));
            M = M / N;
        }
        return flag ? stringBuffer.reverse().toString() : "-" + stringBuffer.reverse().toString();
    }
}