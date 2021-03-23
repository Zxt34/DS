public class HeapSort {
    public static void heapSort(int[] arr) {
        creatHeap(arr);
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            swap(arr,0,heapSize - 1);
            heapSize--;
            shiftDown(arr,heapSize,0);
        }
    }

    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    public static void creatHeap(int[] arr){
        for (int i = (arr.length - 2)/2; i >= 0; i--) {
            shiftDown(arr,arr.length,i);
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
}