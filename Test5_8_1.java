import java.util.Scanner;

public class Test5_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int month = sc.nextInt();
            System.out.println(count(month));
        }
    }

    public static int count(int month) {
        int f0 = 1;
        int f1 = 1;
        int f2 = 0;
        for (int i = 3; i <= month; i++) {
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
}