import java.util.Scanner;

public class Test6_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}