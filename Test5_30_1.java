import java.util.Scanner;

public class Test5_30_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                String id = sc.next();
                String action = sc.next();
                if(action.equals("connect")){
                    count++;
                    if(count > max){
                        max = count;
                    }
                }else{
                    count--;
                }
            }
            System.out.println(max);
        }
    }
}