import java.util.Scanner;

public class Test5_12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int i = 0;
            for (; i < str.length(); i++) {
                int k = i - 1;
                for (; k >= 0; k--) {
                    if(str.charAt(i) == str.charAt(k)){
                        break;
                    }
                }
                int j = i + 1;
                for (; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                        break;
                    }
                }
                if(k < 0 && j == str.length()){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
            if(i == str.length()){
                System.out.println(-1);
            }
        }
    }
}