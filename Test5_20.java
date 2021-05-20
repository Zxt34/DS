import java.util.Scanner;

public class Test5_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            while (sc.hasNext()) {
                int n = sc.nextInt();
                if(n == 0)
                    break;
                System.out.println((long)(Math.pow(5, n) - 4) + " " + (long)(Math.pow(4, n) + n - 4));
            }
        }
    }

    public void oddInOddEvenInEven(int[] arr) {
        int i = 0;
        int j = 1;
        while(i < arr.length && j < arr.length){
            if(arr[arr.length - 1] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
                i += 2;
            }else{
                int temp = arr[j];
                arr[j] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
                j += 2;
            }
        }
    }
}