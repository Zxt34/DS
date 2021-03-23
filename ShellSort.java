public class ShellSort {
    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        while(gap >= 1){
            _shellSort(arr,gap);
            gap = gap / 2;
        }
    }

    public static void _shellSort(int[] arr,int gap) {
        int bound = gap;
        for (; bound < arr.length; bound++) {
            int v = arr[bound];
            int cur = bound - gap;
            for (; cur >= 0; cur -= gap) {
                if(arr[cur] > v){
                    arr[cur + gap] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur + gap] = v;
        }
    }
}