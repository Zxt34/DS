public class SelectSort {
    public static void selectSort(int[] arr) {
        int bound = 0;
        for (; bound < arr.length; bound++) {
            for (int cur = bound + 1; cur < arr.length; cur++) {
                if(arr[cur] < arr[bound]){
                    swap(arr,cur,bound);
                }
            }
        }
    }

    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}