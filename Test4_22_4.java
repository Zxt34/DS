import java.util.Scanner;

public class Test4_22_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
//            String num = switchNum(n);
            String num = Integer.toBinaryString(n);
            int count = 0;
            int max = 0;
            for (int i = 0; i < num.length(); i++) {
                if(num.charAt(i) == '1'){
                    count++;
                    if(count > max){
                        max = count;
                    }
                }else{
                    count = 0;
                }
            }
            System.out.println(max);
        }
    }

//    public static String switchNum(int n){
//        StringBuffer stringBuffer = new StringBuffer();
//        while(n != 0){
//            stringBuffer.append(n % 2);
//            n /= 2;
//        }
//        return stringBuffer.reverse().toString();
//    }
}