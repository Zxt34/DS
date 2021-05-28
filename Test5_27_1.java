import java.util.Scanner;

public class Test5_27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            float res = (count(n) / probability(n)) * 100;
            System.out.println(String.format("%.2f", res) + "%");
        }
    }

    private static float probability(int n) {
        if(n == 0)
            return 1;
        return n * probability(n - 1);
    }

    private static float count(int n) {
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        return (n - 1) * (count(n - 1) + count(n - 2));
    }
}