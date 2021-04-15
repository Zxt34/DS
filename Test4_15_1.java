import java.util.Scanner;

public class Test4_15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = (Integer.parseInt(str[0]) + Integer.parseInt(str[2])) / 2;
        int c = (Integer.parseInt(str[3]) - Integer.parseInt(str[1])) / 2;
        int b1 = (Integer.parseInt(str[2]) - Integer.parseInt(str[0])) / 2;
        int b2 = (Integer.parseInt(str[1]) + Integer.parseInt(str[3])) / 2;
        if(b1 == b2){
            System.out.println(String.valueOf(a));
            System.out.println(" ");
            System.out.println(String.valueOf(b1));
            System.out.println(" ");
            System.out.println(String.valueOf(c));
        }else{
            System.out.println("No");
        }
    }
}