import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] arr) {
        int bound = 1;
        int v = arr[bound];
        int cur = bound - 1;
        for (; bound < arr.length; bound++) {
            for (; cur >= 0; cur--) {
                if(arr[cur] > arr[bound]){
                    arr[cur + 1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur + 1] = v;
        }
    }

    public static void shiftDown(int[] arr,int size,int index){
        int parent = index;
        int child = parent * 2 + 1;
        while (child < size) {
            if(child + 1 < size && arr[child + 1] > arr[child]){
                child = child + 1;
            }
            if(arr[child] > arr[parent]){
                int temp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = temp;
            }else{
                break;
            }
            parent = child;
            child = parent * 2 + 1;
        }
    }

    public static void creatHeap(int[] arr){
        for (int i = (arr.length - 2)/2; i >= 0; i--) {
            shiftDown(arr,arr.length,i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,7,8};
        creatHeap(arr);
        System.out.println(Arrays.toString(arr));
    }
}