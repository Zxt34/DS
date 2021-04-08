import java.util.Scanner;

public class Test4_8 {
    public void bubbleSort(int[] array){
        for (int end = array.length; end >= 0; end--) {
            boolean sorted = true;
            for (int i = 1; i < end; i++) {
                if(array[i - 1] > array[i]){
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }
            }
            if(sorted == true){
                break;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        while(fib2 < n){
            int fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        int ret = (fib2 - n) > (n - fib1) ? n - fib1 : fib2 - n;
        System.out.println(ret);
    }
}