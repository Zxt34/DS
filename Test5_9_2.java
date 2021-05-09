import java.util.Scanner;

public class Test5_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int countOriginal = sc.nextInt();
            if(countOriginal == 0){
                break;
            }
            System.out.println(countPing(countOriginal));
        }
    }

    private static int countPing(int countOriginal) {
        int count = 0;
        while(countOriginal >= 3){
            int huan = countOriginal / 3;
            count += huan;
            int yu = countOriginal % 3;
            countOriginal = yu + huan;
        }
        if(countOriginal == 2){
            count += 1;
        }
        return count;
    }
}