import java.util.Scanner;

public class Test4_20_4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();
                String str = String.valueOf(n);
                StringBuffer stringbuffer = new StringBuffer(str);
                System.out.println(stringbuffer.reverse().toString());
            }
        }
    }