import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4_20_1 {
//    public static void main(String[] args) {
//        double x = 3.0;
//        int y = 5;
//        x /= --y;
//        System.out.println(x);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 1000){
            n = 1000;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(i);
        }
        int i = 0;
        while(res.size() > 1){
            i = (i + 2) % res.size();
            res.remove(i);
        }
        System.out.println(res.get(0));
    }
}