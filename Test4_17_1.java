import java.util.Scanner;

public class Test4_17_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int[][] arr = new int[W][H];
        int count = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
//                if(isTrue(arr,i,j)){
                    count++;
                    arr[i][j] = 2;
                }
            }
        }

//    private static boolean isTrue(int[][] arr,int i,int j){
//
//    }
}