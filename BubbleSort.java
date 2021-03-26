public class BubbleSort {
    public void bubbleSort(int[] arr){
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound ; cur--) {
                if(arr[cur - 1] > arr[cur]){
                    int temp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = temp;
                }
            }
        }
    }
}