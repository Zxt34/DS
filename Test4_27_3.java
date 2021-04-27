import java.util.Scanner;

public class Test4_27_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count = 0;
            String str = Integer.toBinaryString(n);
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}