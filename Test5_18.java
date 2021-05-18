import java.util.Scanner;

public class Test5_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double n = sc.nextDouble();
            double r = sc.nextDouble();
            double l = 2 * r * 3.14;
            if(n <= l){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public int jumpFloorII(int target) {
        if(target == 1){
            return 1;
        }
        return 2 * jumpFloorII(target - 1);
    }
}