import java.util.Scanner;

public class Test5_25_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            int count = 0;
            for (int i = 0; i <= str1.length() - str2.length();) {
                if(str1.substring(i,i + str2.length()).equals(str2)){
                    count++;
                    i += str2.length();
                }else{
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}